package com.nearsoft.workshop;

public class MessageFromSender {
    private final String _message;
    private final String _senderName;

    public MessageFromSender(String message, String senderName) {
        _message = message;
        _senderName = senderName;
    }

    public String getMessage() {
        return _message;
    }

    public String getSenderName() {
        return _senderName;
    }
}
