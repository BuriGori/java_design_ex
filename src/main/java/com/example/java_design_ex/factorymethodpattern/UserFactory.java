package com.example.java_design_ex.factorymethodpattern;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class UserFactory {
    public UserGrade makeUser(String grade){
        if(grade == "A"){return new AUser();}
        else if(grade == "B"){return new BUser();}
        else if(grade == "C"){return new CUser();}
        return null;
    }
}
