/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;

/**
 *
 * @author dsre1
 */
public class Node<T> {

    private T data;
    private Node<T> next;
    private boolean wasVisited;
    
    /**
     * Constructor de la clase Node
     * @param data define el elemento que contendrá el nodo
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.wasVisited = false;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> pnext) {
        this.next = pnext;
    }

    public Color getColorPreferencia() {
        return Color.black;
    }
    
    public void setWasVisited(boolean wasVisited){
        this.wasVisited = wasVisited;
    }
    
    public boolean getWasVisited(){
        return wasVisited;
    }

}
