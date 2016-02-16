package com.nearsoft.workshop;

public class Hiperlink extends DocumentPart {

    private String url;

    public Hiperlink(String text) {
        super(text);
    }

    public Hiperlink(String text, String url) {
        super(text);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}