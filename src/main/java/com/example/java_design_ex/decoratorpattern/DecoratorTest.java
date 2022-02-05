package com.example.java_design_ex.decoratorpattern;

public class DecoratorTest {
    public static void main(String[] args) {
        DecoInf chmGimbob = new ChmGimbob();
        chmGimbob.eat();
        chmGimbob.slice();

        DecoInf tunaGimbob = new TunaGimbob(chmGimbob);
        tunaGimbob.eat();
        tunaGimbob.slice();

        DecoInf tunaCheeseGimbob = new CheeseGimbob(tunaGimbob);
        tunaCheeseGimbob.eat();
        tunaCheeseGimbob.slice();
    }
}
