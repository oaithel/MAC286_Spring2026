package com.mac286.hashtables;

public class OurHashtable <K, T>{
    private class Node<KK, TT>{
        private KK key;
        private TT data;

        public KK getKey() {
            return key;
        }
        public void setKey(KK key) {
            this.key = key;
        }
        public TT getData() {
            return data;
        }
        public void setData(TT data) {
            this.data = data;
        }
        @Override
        public String toString() {
            return key+ "=" + data;
        }
    }
    //Our hashtable will be implemented using an array of nodes
    private Node<K, T> [] H;
    private float loadFactor;
    private int size;
    public OurHashtable(){
        H = new Node[10];
        size = 0;
        loadFactor = 0.75f;
    }
    public OurHashtable(int cap){
        H = new Node[cap];
        size = 0;
        loadFactor = 0.75f;
    }
    public OurHashtable(int cap, float lf){
        H = new Node[cap];
        size = 0;
        loadFactor = lf;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    private int hashFunction(K k){
        //take the absolute value of java hashcode of k
        // and use modulo of the array length
    }
    public void put(K k, T d){
        //find the index using the hash function
        //as long as H[index] is not null
            //compare key to key of this elements if equal, replace
            //data and return
            //if not go to next element

        //If we get here at the end of the loop, means it does not exist
            //create a node.
            //as long as H[index modulo length] is not null, mode to next
                //store the node in the current element.
    }
    public String toString(){
        //start at 0, while empty move until we find the first
        //non empty element.
            //Create a string with "{" and first element
        //continue the loop from that point on until the end
            //if current element is not null, add "," + element to it.
    }
}
