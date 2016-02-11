package com.nearsoft.workshop;

import org.eclipse.jetty.websocket.api.Session;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import static j2html.TagCreator.*;

// Java already has java.util.Observer
public class ChatObserver {

    private final Session _session;
    private final String _name;

    public ChatObserver(Session session, String name) {
        _session = session;
        _name = name;
    }

    public void update(ChatObservable o, MessageFromSender message) {
        try {
            _session.getRemote().sendString(String.valueOf(new JSONObject()
                    .put("userMessage", createHtmlMessageFromSender(message.getSenderName(), message.getMessage()))
                    .put("userlist", o.getUserList())
            ));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Builds a HTML element with a sender-name, a message, and a timestamp,
    private static String createHtmlMessageFromSender(String sender, String message) {
        return article().with(
                b(sender + " says:"),
                p(message),
                span().withClass("timestamp").withText(new SimpleDateFormat("HH:mm:ss").format(new Date()))
        ).render();
    }

    public String getName() {
        return _name;
    }

    public Session getSession() {
        return _session;
    }
}
