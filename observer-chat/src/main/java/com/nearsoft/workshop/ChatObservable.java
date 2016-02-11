package com.nearsoft.workshop;


import org.eclipse.jetty.websocket.api.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Note java already has java.util.Observable;
public class ChatObservable {

    private List<ChatObserver> _observers;

    public ChatObservable() {
        _observers = new ArrayList<>();
    }

    public synchronized void addObserver(ChatObserver o) {
        _observers.add(o);
    }

    public synchronized void removeObserver(ChatObserver o) {
        _observers.remove(o);
    }

    public void notifyObservers(MessageFromSender message) {
        for (ChatObserver o : _observers) {
            o.update(this, message);
        }
    }


    public List<String> getUserList() {
        return _observers.stream().map(ChatObserver::getName).collect(Collectors.toList());
    }

    public ChatObserver getBySession(Session session) {
        return _observers.stream().filter(o -> o.getSession().equals(session)).findFirst().get();
    }
}
