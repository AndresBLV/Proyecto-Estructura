/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author andre
 */
public class MapaGrafoUtils {
   public MapaGrafoUtils() {}
    
    public static MapaGrafo construirMapa(GrafMatPeso grafMatPeso) {
        Node<Store>[] vertices = grafMatPeso.getNodes();
        int[][] pesos = grafMatPeso.getMatPeso();
        List<VerticeGrafico> verticesGraficos = new ArrayList<>(vertices.length);
        List<AristaGrafica> aristasGraficas = new ArrayList<>(vertices.length * vertices.length);
        Random random = new Random();
        // Primero llenamos la lista de vertices graficos
        for (int v = 0; v < grafMatPeso.getNumNods(); v++) {
            Node<Store> vertice = vertices[v];
            int x = random.nextInt(700);
            int y = random.nextInt(500);
            VerticeGrafico vGrafico = new VerticeGrafico(x, y, vertice, vertice.getColorPreferencia());
            verticesGraficos.add(vGrafico);
        }
        
        // llenamos lista de aristas graficas
        // iteramos luego de llenar la lista de vertices y no durante, 
        // para asegurar que existan todas las referencias de los objetos de VerticeGrafico
        for (int i = 0; i < grafMatPeso.getNumNods(); i++) {
            for (int j = 0; j < grafMatPeso.getNumNods(); j++) {
                VerticeGrafico origen = verticesGraficos.get(i);
                VerticeGrafico destino = verticesGraficos.get(j);
                int peso = pesos[i][j];
                if (peso != GrafMatPeso.INFINITO) {
                    aristasGraficas.add(new AristaGrafica(peso, origen, destino));
                }
            }
        }
        
        return new MapaGrafo(verticesGraficos, aristasGraficas);
    } 
}
