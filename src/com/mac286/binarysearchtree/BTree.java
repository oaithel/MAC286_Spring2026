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
        Node<K, T> temp = root;
        //forever
        while(true) {
            //if k is less than the key at temp then
            if(k.compareTo(temp.getKey()) < 0) {
                //if there is something on the left, go left
                if(temp.getLeft()!= null){
                    temp = temp.getLeft();
                    continue; //go back to while
                }
                //else add the node to the left, increase size, get out
                temp.setLeft(n);
                size++;
                return; //breaks the loop
            }else {
                //else (k is larger
                //if there is something on the right, go right
                if(temp.getRight() != null){
                    temp = temp.getRight();
                    continue;
                }
                // else add the node to the right, increase size, get out
                temp.setRight(n);
                size++;
                return;
            }
        }

    }
    //Tree traversal
    public void preOrderTraversal(){
        System.out.println("---------------PreOrder----------");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(Node<K, T> n){
        if(n == null){
            return;
        }
        System.out.print("  " + n);
        //explore the left subtree
        preOrder(n.getLeft());
        //explore the right subtree
        preOrder(n.getRight());
    }
    public void inOrderTraversal(){
        System.out.println("---------------inOrder----------");
        inOrder(root);
        System.out.println();
    }
    private void inOrder(Node<K, T> n){
        if(n == null){
            return;
        }
        //explore the left subtree
        inOrder(n.getLeft());
        //visit the root
        System.out.print("  " + n);
        //explore the right subtree
        inOrder(n.getRight());
    }
    public void postOrderTraversal(){
        System.out.println("---------------postOrder----------");
        postOrder(root);
        System.out.println();
    }
    private void postOrder(Node<K, T> n){
        if(n == null){
            return;
        }
        //explore the left subtree
        postOrder(n.getLeft());
        //explore the right subtree
        postOrder(n.getRight());
        //visit the root
        System.out.print("  " + n);
    }
    //returns the reference to the node with key k
    private Node<K, T> find(K k){
        return null;
    }
    //returns refrence to smallest on Right
    private Node<K, T> smallestOnRight(Node<K, T> n){
        return null;
    }
    //returns refrence to largest on left
    private Node<K, T> largestOnRight(Node<K, T> n){
        return null;
    }
    private Node<K, T> parentOf(K k){

        return null;
    }

}
