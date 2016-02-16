package com.nearsoft.workshop.visitor.html;

import com.nearsoft.workshop.BoldText;
import com.nearsoft.workshop.Hiperlink;
import com.nearsoft.workshop.PlainText;
import com.nearsoft.workshop.Visitor;

public class HtmlVisitor implements Visitor {

    private String output = "";

    @Override
    public void visit(PlainText docPart) {
        output += docPart.getText();
    }

    @Override
    public void visit(BoldText docPart) {
        output += "<b>" + docPart.getText() + "</b>";
    }

    @Override
    public void visit(Hiperlink docPart) {
        output += "<a href=\"" + docPart.getUrl() + "\">" + docPart.getText() + "</b>";
    }

    public String getOutput() {
        return "<html><body>"+output+"</body></html>";
    }
}
