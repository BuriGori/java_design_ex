package com.example.java_design_ex.observerpattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayersTeam {
    String name;
    List<Playertype> playertypeList = new ArrayList<>();
    List<ObserverInf> ObserverList = new ArrayList<>();

    public void addPlayer(Playertype playertype){
        playertypeList.add(playertype);
        return;
    }
//    public void removePlayer(String position){
//        for(Playertype cur : playertypeList){
//            if(cur.getPosition() == position)playertypeList.remove(cur);
//        }
//        return;
//    }
    public void addOb(ObserverInf observerInf){
        ObserverList.add(observerInf);
        return;
    }
//    public void removeOb(ObserverInf observerInf){
//        ObserverList.remove( ObserverList.stream().filter(o -> o.getClass().isInstance(observerInf.getClass())));
//        return;
//    }

    public void goPlay(){
        for(var a : playertypeList){
            log.info("Team says {} go to ground",a.getPosition());
            for(var cur : ObserverList){
                cur.update(a);
            }
        }
    }
}
