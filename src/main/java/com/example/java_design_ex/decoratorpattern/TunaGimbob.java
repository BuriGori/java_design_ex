package com.example.java_design_ex.decoratorpattern;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class TunaGimbob implements DecoInf{

    private final DecoInf decoInf;
    public TunaGimbob(DecoInf chmGimbob){
        this.decoInf = chmGimbob;
    }

    @Override
    public void eat() {
        decoInf.eat();
        log.info("this taste is a tuna");
    }

    @Override
    public void slice() {
        decoInf.slice();
        log.info("there is a tuna");
    }
}
