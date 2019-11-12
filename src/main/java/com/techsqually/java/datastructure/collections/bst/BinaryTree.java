package com.techsqually.java.datastructure.collections.bst;


public class BinaryTree {

    Node root;
    BinaryTree(int key){

        root = new Node(key);
    }

    BinaryTree(){
        root = null;
    }




}


class Node {

    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left=right=null;
    }

}
