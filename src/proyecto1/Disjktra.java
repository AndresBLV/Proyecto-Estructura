package operaciones;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import objetos.Arista;
import objetos.Enlace;
import objetos.Grafo;
import objetos.Nodo;


public class Disjktra {
    GrafMatPeso grafo;
    List<Stores> listaNodosAdyacentes;
    int nNodos;
    List conj_S = new ArrayList();
    List conjComp_S = new ArrayList();
    List caminos = new ArrayList();
    String tmp;
    public Disjktra(Grafo grafo){
        this.grafo = grafo;
        listaNodosAdyacentes = new ListaNodo();
    }
   private void resuelve(int origen){
    int nod;
    int minimo;
    int aux;
    int nodCambio=0;
    int intento;
    String tmp2;
    //Inicializando listas
    for(int i=0;i<nNodos;i++){
      if(i!=origen)
        conjComp_S.add(""+i);
      else
        conj_S.add(""+i);
      caminos.add("");
    }
    //Aplicando ciclo i de diksjtra
    for(int i=0;i<nNodos;i++){
      minimo=-1;
      for(int j=0;j<conjComp_S.size();j++){
        nod=Integer.valueOf((String)(conjComp_S.get(j))).intValue();
        aux=min(nod);
        if(minimo==-1 || (aux<minimo && aux!=-1)){
          minimo=aux;
          nodCambio=j;
        }
      }
      if(minimo!=-1){
        conj_S.add(""+(String)(conjComp_S.get(nodCambio)));
        conjComp_S.remove(nodCambio);
      }
    }
    //Imprimiendo resultados
    System.out.print("\n -> Resultados <-");
    for(int k=0;k<caminos.size();k++)
      if(k!=origen){
        tmp=(String)(caminos.get(k))+(char)(k+65);
        caminos.set(k,tmp);
      }
    for(int j=0;j<caminos.size();j++)
      if(j!=origen){
        intento=0;
        tmp=(String)(caminos.get(j));
          while(tmp.charAt(0)!=(char)(origen+65) && intento<10){
            aux=tmp.charAt(0)-65;
            tmp=((String)(caminos.get(aux)))+tmp.substring(1,tmp.length());
            if(++intento==10)
              tmp="*"+tmp;
          };
        imprimeCamino(tmp,j,origen);
      }
    System.out.println("\n <-  Que tenga un buen viaje! ->\n");
  }

}