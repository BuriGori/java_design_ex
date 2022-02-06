package com.example.java_design_ex.templatemethodpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GoogleSearch extends TemplateAbs{
    @Override
    protected String targetName() {
        return "GoogleName";
    }

    @Override
    protected void encodingTime(String target) {
        log.info("encoding {} at Google Homepage",target);
    }

    @Override
    protected void dbSearching(String target) {
        log.info("Searching to Google huge db for {}",target);
    }

    @Override
    protected void showResult(String target) {
        log.info("{} have many result",target);
    }
}
