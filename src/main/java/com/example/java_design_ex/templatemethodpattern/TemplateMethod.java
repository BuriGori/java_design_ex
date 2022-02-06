package com.example.java_design_ex.templatemethodpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class TemplateMethod {
    private TemplateAbs method;
    public void doIt(){
        method.searchName();
    }
    public void changeMethod(TemplateAbs templateAbs){
        this.method = templateAbs;
    }
}
