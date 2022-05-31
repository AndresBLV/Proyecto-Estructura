/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author dsre1
 */
public class List<T> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    /**
     * Constructor de Lista Genérica
     */
    public List() {
        this.first = this.last = null;
    }

    /**
     * Método que determina si la lista está vacía
     *
     * @return un valor booleano dependiendo si la lista está vacía o no
     */
    public boolean isEmpty() {
        return this.first == null;
    }

    /**
     * Método que agrega un nuevo elemento al final de la lista
     *
     * @param data define el nuevo elemento a agregar
     * @return el nodo requerido
     */
    public void append(T data) {
        Node<T> temp = new Node<>(data);

        if (this.isEmpty()) {
            this.first = this.last = temp;
        } else {
            this.last.setNext(temp);
            this.last = temp;
        }
        size++;
    }
    
    /**
     * Método que busca dentro de la lista un nodo por el index
     *
     * @param int la posición del nodo a retornar
     */
    public Node<T> getNode(int index) {
        if (!this.isEmpty()) {
            Node<T> aux = this.first;
            for (int i = 0; i < index ; i++) {
                aux = aux.getNext();
            }
            return aux;
        } else {
            return null;
        }
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
