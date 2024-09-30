
package com.mycompany.jes.t6;



class Node {
    private int key;
    public Alumno value;
    public Node left;
    public Node right;

    public Node(int key, Alumno value) {
        this.key = key;
        this.value = value;
        this.left = null;
        this.right = null;
    }

    
    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Alumno getValue() {
        return value;
    }

    public void setValue(Alumno value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}

