package com.example.java_design_ex.templatemethodpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NaverSearch extends TemplateAbs{
    @Override
    protected String targetName() {
        return "NaverName";
    }

    @Override
    protected void encodingTime(String target) {
      log.info("Encoding {} at Naver Web",target);
    }

    @Override
    protected void dbSearching(String target) {
        log.info("Searching Naver Cloud Data for {}",target);
    }

    @Override
    protected void showResult(String target) {
        log.info("{} have few data",target);
    }
}
