package com.stanrunge.opt3.computers;

public abstract class SetupBuilder {
    Computer computer;
    Mouse mouse;
    Keyboard keyboard;
    Monitor monitor;

    public final Setup buildSetup() {
        addComputer();
        addMouse();
        addKeyboard();
        addMonitor();
        return new Setup(computer, monitor, keyboard, mouse);
    }

    public abstract void addComputer();
    public abstract void addMouse();
    public abstract void addKeyboard();
    public abstract void addMonitor();
}
