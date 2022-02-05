package com.example.java_design_ex.decoratorpattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChmGimbob implements DecoInf {
    @Override
    public void eat() {
      log.info("this taste is a gimbob");
    }

    @Override
    public void slice() {
        log.info("there is a gimbob");
    }
}
