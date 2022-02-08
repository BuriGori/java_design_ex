package com.example.java_design_ex.compositepattern;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CompositeTest {
    public static void main(String[] args) {
        LeafNode leafNode1 = new LeafNode();
        LeafNode leafNode2 = new LeafNode();
        LeafNode leafNode3 = new LeafNode();
        LeafNode leafNode4 = new LeafNode();

        RootNode rootNode1 = new RootNode();
        RootNode rootNode2 = new RootNode();
        RootNode rootNode3 = new RootNode();

        rootNode3.addNode(leafNode1);
        rootNode3.addNode(leafNode3);
        rootNode3.addNode(leafNode2);
        rootNode2.addNode(leafNode4);

        rootNode1.addNode(rootNode2);
        rootNode1.addNode(rootNode3);
        rootNode1.print();
        rootNode1.removeNode(rootNode3);
        log.info("---------------remove---------");
        rootNode1.print();
    }
}
