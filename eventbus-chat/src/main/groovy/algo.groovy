import io.vertx.groovy.core.Vertx
import io.vertx.groovy.core.eventbus.Message
import io.vertx.groovy.core.http.HttpServerRequest

import java.text.SimpleDateFormat

import static j2html.TagCreator.*

def vertx = Vertx.vertx()

def eb = vertx.eventBus()

vertx.createHttpServer().websocketHandler({ ws ->
    ws.handler({ m ->
        eb.publish("chat", m)
    })
    eb.consumer("chat").handler({ message ->
        ws.writeFinalTextFrame(getMessageBody(message))
    })
}).requestHandler({ req ->
    handleResources(req)
}).listen(8080)

def String getMessageBody(Message message) {
    return article().with(
            b("Server says:"),
            p(message.body().toString()),
            span().withClass("timestamp").withText(new SimpleDateFormat("HH:mm:ss").format(new Date()))
    ).render();

}

def void handleResources(HttpServerRequest req) {
    if (req.uri() == "/") {
        req.response().sendFile("public/index.html")
    }
    if (req.uri() == "/style.css") {
        req.response().sendFile("public/style.css")
    }
    if (req.uri() == "/websocketDemo.js") {
        req.response().sendFile("public/websocketDemo.js")
    }
}

