/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafo;


import Clases.NodoAlmacen;
import java.awt.Color;

/**
 *
 * @author andre
 */
public class VerticeAlmacen extends Vertice{
     
    private NodoAlmacen almacen;
    
    public VerticeAlmacen(String etiqueta) {
        super(etiqueta);
    }

    public VerticeAlmacen(NodoAlmacen almacen) {
        super(almacen.getLetra(), almacen.getNombre());
        this.almacen = almacen;
    }

    public NodoAlmacen almacen() {
        return almacen;
    }

    /**
     * Método que define la información de los restaurantes
     */
    public void setAlmacen(NodoAlmacen almacen) {
        this.almacen = almacen;
    }

    /**
     * Método que obtiene la información de los restaurantes
     */
    public NodoAlmacen getAlmacen() {
        return almacen;
    }
    
    @Override
    public Color getColorPreferencia() {
        return new Color(143, 220, 180);
    }  
}
