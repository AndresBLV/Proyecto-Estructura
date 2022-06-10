/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author andre
 */
public class MapaGrafoUtils {

    public MapaGrafoUtils() {
    }

    public void construirMapa(GrafMatPeso grafMatPeso, List<Route> routes) {
        System.setProperty("org.graphstream.ui", "swing");

        Graph graph = new SingleGraph("Tutorial 1");

        graph.setStrict(false);
        graph.setAutoCreate(true);

        Node<Store>[] nodos = grafMatPeso.getNodes();

        for (int i = 0; i < grafMatPeso.getNumNods(); i++) {
            Node<Store> nodo = nodos[i];
            String name = nodo.getData().getName();
            graph.addNode(name);
            graph.getNode(name).setAttribute("ui.label", "      " + name);
        }

        for (int i = 0; i < routes.getSize(); i++) {
            Node<Route> route = routes.getNode(i);
            String origin = nodos[grafMatPeso.numNode(route.getData().getOrigin())].getData().getName();
            String destiny = nodos[grafMatPeso.numNode(route.getData().getDestiny())].getData().getName();

            graph.addEdge(origin + destiny, origin, destiny, true);
            graph.getEdge(origin + destiny).setAttribute("ui.label", "      " + route.getData().getWeight());

        }

        graph.display();
    }
}
