/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author andre
 */
public class Aplicacion {
    private static GrafMatPeso gf;
    
    public static void main(String[] args) {
        gf = new GrafMatPeso(100);
        
        Interfaz interfaz = new Interfaz(gf);
        interfaz.setVisible(true);
    }
    
    public static GrafMatPeso getGrafo() {
        return gf;
    }
}
