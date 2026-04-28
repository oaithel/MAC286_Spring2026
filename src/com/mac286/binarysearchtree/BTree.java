package com.mac286.binarysearchtree;

public class BTree <K extends Comparable, T>{
    private class Node<D extends Comparable, F>{
        private D key;
        private F data;
        private Node<D, F> left, right;

        public Node(){
            key = null;
            data = null;
            left = right = null;
        }
        public Node(D k, F d){
            key = k;
            data = d;
            left = right = null;
        }
        public D getKey() {
            return key;
        }
        public void setKey(D key) {
            this.key = key;
        }
        public F getData() {
            return data;
        }
        public void setData(F data) {
            this.data = data;
        }
        public Node<D, F> getLeft() {
            return left;
        }
        public void setLeft(Node<D, F> left) {
            this.left = left;
        }
        public Node<D, F> getRight() {
            return right;
        }
        public void setRight(Node<D, F> right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "(" + key +
                    " = " + data + ")";
        }
    }

    private Node<K, T> root;
    private int size;
    public BTree(){
        root = null;
        size = 0;
    }
    public void insert(K k, T d){
        //create a Node with k and d
        Node<K, T> n = new Node<K, T>(k, d);
        if(root == null){
            root = n;
            size = 1;
            return;
        }

        //start with a temporary reference to root
        //forever
            //if k is less than the key at temp then
                //if there is something on the left, go left
                //else add the node to the left, increase size, get out
            //else (k is larger
                //if there is something on the right, go right
                // else add the node to the right, increase size, get out

    }

}
