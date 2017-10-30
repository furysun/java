package com.company.abstractFactoryMethod;

public class WindowsFactory implements GUIFactory {

    @Override
    public WindowsButton createButton() {
        return new WindowsButton();
    }

    @Override
    public WindowsCheckbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
