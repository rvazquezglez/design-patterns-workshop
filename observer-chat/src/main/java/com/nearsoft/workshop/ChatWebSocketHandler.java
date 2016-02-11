package com.nearsoft.workshop;

import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebSocket
public class ChatWebSocketHandler {

    private final Logger _log = LoggerFactory.getLogger(this.getClass());
    private static ChatObservable _chatObservable = new ChatObservable();

    @OnWebSocketConnect
    public void onConnect(Session session) {
        _log.info("Connect: " + session.getRemoteAddress().getAddress());
        String userName = Integer.toString(_chatObservable.getUserList().size());
        _chatObservable.addObserver(new ChatObserver(session, userName));
        _chatObservable.notifyObservers(new MessageFromSender(userName + " joined the chat", "Server"));
    }

    @OnWebSocketClose
    public void onClose(Session session, int statusCode, String reason) {
        _log.info("Close: statusCode=" + statusCode + ", reason=" + reason);
        ChatObserver chatObserver = _chatObservable.getBySession(session);
        _chatObservable.removeObserver(chatObserver);
        _chatObservable.notifyObservers(new MessageFromSender(chatObserver.getName() + "  left the chat", "Server"));
    }

    @OnWebSocketMessage
    public void onMessage(Session session, String message) {
        _log.info("Message: " + message);
        _chatObservable.notifyObservers(new MessageFromSender(message, _chatObservable.getBySession(session).getName()));
    }

    @OnWebSocketError
    public void onError(Throwable t) {
        _log.info("Error: " + t.getMessage());
    }


}
