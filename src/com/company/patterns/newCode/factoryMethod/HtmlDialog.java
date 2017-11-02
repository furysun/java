package com.company.patterns.newCode.factoryMethod;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
