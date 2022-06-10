/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author dsre1
 */
public class GrafMatPeso {

    public static int INFINITO = 0;
    private int[][] matWeight;
    private Node<Store>[] nodes;
    private int maxNods;
    private int numNods;
    private Stack theStack;
    private Queue theQueue;

    public GrafMatPeso(int maxNods) {
        this.maxNods = maxNods;
        this.numNods = 0;
        this.matWeight = new int[maxNods][maxNods];
        this.nodes = new Node[maxNods];
        theStack = new Stack();
    }

    public void setMatFromLists(List<Store> stores, List<Route> routes) {
        if (!stores.isEmpty()) {
            Node<Store> store = stores.getFirst();

            while (store != null) {
                insertNode(store);
                store = store.getNext();
            }
        }

        if (!routes.isEmpty()) {
            Node<Route> route = routes.getFirst();

            while (route != null) {
                String tempOrigin = route.getData().getOrigin();
                String tempDestiny = route.getData().getDestiny();
                Node<Store> nodeOrigin = nodes[numNode(tempOrigin)];
                Node<Store> nodeDestiny = nodes[numNode(tempDestiny)];

                nuevoArco(nodeOrigin, nodeDestiny, route.getData().getWeight());
                route = route.getNext();
            }
        }
    }

    public void insertNode(Node<Store> node) {
        nodes[numNods] = node;
        numNods++;
    }

    public void nuevoArco(Node<Store> origin, Node<Store> destiny, int peso) {
        int a, b;
        a = numNode(origin);
        b = numNode(destiny);
        matWeight[a][b] = peso;
    }

    public int numNode(String temp) {
        for (int i = 0; i < numNods; i++) {
            boolean encontrado = nodes[i].getData().getName().equals(temp);

            if (encontrado) {
                return i;
            }
        }

        return -1;
    }

    public int numNode(Node<Store> temp) {
        for (int i = 0; i < numNods; i++) {
            boolean encontrado = nodes[i].equals(temp);

            if (encontrado) {
                return i;
            }
        }

        return -1;
    }

    public void printAlmacen(){
        for (int i = 0; i < numNods; i++) {
            JOptionPane.showMessageDialog(null,"Almacen: "+ nodes[i].getData().getName());
            for (int j = 0; j < nodes[i].getData().getProducts().getSize(); j++) {
                JOptionPane.showMessageDialog(null,"Producto " + (j+1) + "\n" +((Product) nodes[i].getData().getProducts().getNode(j).getData()).getReference()+"\n"+"Cantidad:"+((Product) nodes[i].getData().getProducts().getNode(j).getData()).getQuantity());
            }
        }
    }
    
    public void print() {
        for (int i = 0; i < numNods; i++) {
            for (int j = 0; j < numNods; j++) {
                 JOptionPane.showMessageDialog(null,matWeight[i][j]);
            }
        }

    }

    public void displayVertex(int v) {
        System.out.println(nodes[v].getData().getName());
    }

    public int[][] getMatPeso() {
        return matWeight;
    }

    public Node<Store>[] getNodes() {
        return nodes;
    }

    public int getNumNods() {
        return numNods;
    }

    public void dfs() {
        nodes[0].setWasVisited(true); // Comienza desde el primer vértice y marca
        displayVertex(0); // salida
        theStack.push(0); // Empuje en la pila ----- Coloque el subíndice de vértice en la pila

        while (!theStack.isEmpty()) {
            int v = getAdjUnvisitedVertex_dfs(theStack.peek()); // Se saca el índice de vértice en la parte superior de la pila
            if (v == -1) {
                // No hay una relación adyacente entre el vértice y el vértice superior de la pila, y la pila aparece
                theStack.pop();
            } else {
                // Vértice existente y su relación de adyacencia, marca y salida, push
                nodes[v].setWasVisited(true);
                displayVertex(v);
                 print();
                theStack.push(v);
            }
        }		//end while
    }

    public int getAdjUnvisitedVertex_dfs(int v) {
        for (int j = 0; j < this.numNods; j++) // atraviesa los vértices existentes, si hay una adyacencia con el vértice superior de la pila, devuelve su subíndice
        {
            if (this.matWeight[v][j] == 1 && nodes[j].getWasVisited() == false) {
                return j;
            }
        }
        return -1; // Si no, return -1
    }	//end getAdjUnvisitedVertex()

    public void bfs() {
        nodes[0].setWasVisited(true);
        displayVertex(0);
        theQueue.insert(0);
        int v2;

        while (!theQueue.isEmpty()) {
            int v1 = theQueue.remove();
            while ((v2 = getAdjUnvisitedVertex_bfs(v1)) != -1) {
                nodes[0].setWasVisited(true);
                displayVertex(v2);
                theQueue.insert(v2);
            }//end while
        }//end while(queue ont empty)

        for (int j = 0; j < this.numNods; j++) {
            nodes[0].setWasVisited(false);
        }
    }//end bfs

    public int getAdjUnvisitedVertex_bfs(int v) {
        for (int j = 0; j < this.numNods; j++) {
            if (this.matWeight[v][j] == 1 && nodes[j].getWasVisited() == false) {
                return j;
            }
        }
        return -1;
    }//end getAdjUnvisitedVertex()

}
