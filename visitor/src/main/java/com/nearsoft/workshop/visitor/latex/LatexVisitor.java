package com.nearsoft.workshop.visitor.latex;

import com.nearsoft.workshop.BoldText;
import com.nearsoft.workshop.Hiperlink;
import com.nearsoft.workshop.PlainText;
import com.nearsoft.workshop.Visitor;

public class LatexVisitor implements Visitor {

    private String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
        output += "\\textbf{" + docPart.getText() + "}";
    }

    @Override
    public void visit(Hiperlink docPart) {
        output += "\\href={" + docPart.getUrl() + "}{" + docPart.getText() + "}";
    }

    @Override
    public String getOutput() {
        return output;
    }
}
