package com.stanrunge.opt3.computers;

public class PremiumSetupBuilder extends SetupBuilder {
    Computer computer;
    Mouse mouse;
    Keyboard keyboard;
    Monitor monitor;

    public Setup build() {
        return new Setup(computer, monitor, keyboard, mouse);
    }

    @Override
    public void addComputer() {
        computer = new Computer();
    }

    @Override
    public void addMouse() {
        mouse = new Mouse();
    }

    @Override
    public void addKeyboard() {
        keyboard = new Keyboard();
    }

    @Override
    public void addMonitor() {
        monitor = new Monitor();
    }
}
