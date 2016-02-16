package com.nearsoft.workshop;

public interface Visitor {

    void visit(PlainText docPart);

    void visit(BoldText docPart);

    void visit(Hiperlink docPart);

    String getOutput();
}
