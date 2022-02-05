package com.example.java_design_ex.singletonpattern;

public class SingletoneHold {
    private SingletoneHold(){}

    public static class singletoneHolder {
        public static final SingletoneHold instance = new SingletoneHold();
    }
    public static SingletoneHold getInstance(){
        return singletoneHolder.instance;
    }

    @Override
    public String toString() {
        return "singletoneHold{}";
    }
}
