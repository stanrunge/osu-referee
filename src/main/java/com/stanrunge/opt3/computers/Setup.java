package com.stanrunge.opt3.computers;

public class Setup {
    private Computer computer;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Setup(Computer computer, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.computer = computer;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
