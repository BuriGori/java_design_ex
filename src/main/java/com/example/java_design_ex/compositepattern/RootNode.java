package com.example.java_design_ex.compositepattern;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
@NoArgsConstructor
public class RootNode implements Node{

    ArrayList<Node> nodes = new ArrayList<>();

    @Override
    public void print() {
        for(var cur : nodes){
            cur.print();
        }
    }
    public void addNode(Node leafNode){
        nodes.add(leafNode);
        return;
    }
    public void removeNode(Node leafNode){
        nodes.remove(leafNode);
        return;
    }
}
