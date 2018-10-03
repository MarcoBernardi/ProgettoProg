/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_ereditarietà;

import java.util.ArrayList;

/**
 *
 * @author Marco
 */
public class Geometrie {
    private ArrayList<Poligono> poligoni;
    private int n_elem;
    
    public Geometrie(){
       poligoni=new ArrayList();
       n_elem=0;
    }
    
      public int getNumElem(){
        return this.n_elem;
    }  
    
    public boolean InsertPoligono(float base, float altezza, String tipo){
        Poligono poligono = null;
        switch(tipo){
            case "rettangolo":
                poligono = new Rettangolo(base,altezza);
                break;
            case "parallelogramma":
                poligono = new Parallelogramma(base,altezza);
                break;
            case "triangolo":
                poligono = new Triangolo(base,altezza);
                break;
            default: break;
        }
        if(poligono!=null && checkDuplicates(poligono)==false){
            this.poligoni.add(poligono);
            this.n_elem++;
            return true;
        }
        else return false;


    }

    
    private boolean checkDuplicates(Poligono poligono){
        for (int i = 0; i < poligoni.size(); i++) {
                        if (poligono.equals(poligoni.get(i)))
                            return true;
        }
        return false;
    }
    
    public void printAree() {
            for (int i = 0; i < poligoni.size(); i++) {
                System.out.println("Area di: " + poligoni.get(i).getClass() + ": " + poligoni.get(i).getArea());
            }
    }
    


    
    
}
