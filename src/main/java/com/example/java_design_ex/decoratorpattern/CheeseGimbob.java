package com.example.java_design_ex.decoratorpattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class CheeseGimbob implements DecoInf{

    private final DecoInf decoInf;
    public CheeseGimbob(DecoInf decoInf){
        this.decoInf = decoInf;
    }

    @Override
    public void eat() {
        decoInf.eat();
        log.info("this taste is cheese");
    }

    @Override
    public void slice() {
        decoInf.slice();
        log.info("there is a cheese");
    }
}
