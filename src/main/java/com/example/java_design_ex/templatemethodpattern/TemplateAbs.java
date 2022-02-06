package com.example.java_design_ex.templatemethodpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class TemplateAbs {
    protected abstract String targetName();
    protected abstract void encodingTime(String target);
    protected abstract void dbSearching(String target);
    protected abstract void showResult(String target);

    public void searchName(){
        var target = targetName();
        log.info("----------setting name --------");
        encodingTime(target);
        dbSearching(target);
        showResult(target);
    }
}
