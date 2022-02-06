package com.example.java_design_ex.templatemethodpattern;

public class TemplateTest {
    public static void main(String[] args) {
        var user = new TemplateMethod(new GoogleSearch());
        user.doIt();
        user.changeMethod(new NaverSearch());
        user.doIt();

    }
}
