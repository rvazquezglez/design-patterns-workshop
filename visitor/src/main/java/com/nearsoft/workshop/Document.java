package com.nearsoft.workshop;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<DocumentPart> parts = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (DocumentPart part : parts) {
            part.accept(visitor);
        }
    }

    public void addPart(DocumentPart part) {
        parts.add(part);
    }
}
