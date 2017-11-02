package com.company.patterns.newCode.abstractFactoryMethod;

public class MacOSFactory implements GUIFactory {

    @Override
    public MacOSButton createButton() {
        return new MacOSButton();
    }

    @Override
    public MacOSCheckbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
