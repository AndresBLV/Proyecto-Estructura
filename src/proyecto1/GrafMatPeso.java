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
public class GrafMatPeso {
    public static int INFINITO = 0;
    private int[][] matWeight;
    private Node<Store>[] nodes;
    private int maxNods;
    private int numNods;

    public GrafMatPeso(int maxNods) {
        this.maxNods = maxNods;
        this.numNods = 0;
        this.matWeight = new int[maxNods][maxNods];
        this.nodes = new Node[maxNods];
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
    
    public void print() {
        for(int i = 0; i < numNods; i++) {
            for(int j = 0; j < numNods; j++) {
                System.out.println(matWeight[i][j]);
            }
        }
        
    }
    
    public void print2() {
        System.out.println(nodes[0].getData().getProducts().getSize());
        
    }

    public int [][] getMatPeso(){
        return matWeight;
    }
    
    public Node<Store>[] getNodes(){
        return nodes;
    }
    
    public int getNumNods(){
        return numNods;
    }
}
