package com.example.java_design_ex.compositepattern;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class LeafNode implements Node{
    @Override
    public void print() {
        log.info("LeafNode visited!");
    }
}
