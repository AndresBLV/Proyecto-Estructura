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
public class RouteManagement {
    public void NewRoute(GrafMatPeso gf, List<Route> routes, Node<Store> origin, Node<Store> destiny, int weight) {
        System.out.println(origin.getData().getName());
        System.out.println(destiny.getData().getName());
        Route newRoute = new Route(origin.getData().getName(), destiny.getData().getName(), weight);
        gf.nuevoArco(origin, destiny, weight);
        routes.append(newRoute);
    }
}
