package com.example.java_design_ex.templatemethodpattern;

public class TemplateTest {
    public static void main(String[] args) {
        var user = new TemplateMethod(new GoogleSearch());
        user.doIt();
        user.changeMethod(new NaverSearch());
        user.doIt();
        //일련 과정에 대해서 정리할 수 있을 것 같다.
    }
}
