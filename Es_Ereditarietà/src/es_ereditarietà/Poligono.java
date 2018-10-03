/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_ereditarietà;

/**
 *
 * @author Marco
 */
public abstract  class Poligono {
    
    private final int n_vertici;
    private final float base;
    private final float altezza;
    

    public Poligono(float base, float altezza, int n_vertici){
        this.base=base;
        this.altezza=altezza;
        this.n_vertici=n_vertici;
    }
    
    public abstract float getArea();
   

    public  int getVertici(){
        return n_vertici;
    }    
    
    public float getAltezza(){
        return this.altezza;
    }
    
    public float  getBase(){
        return this.base;
    }
    
        public String toString() {
        return n_vertici + " - " + base + " - " + altezza;
    }

    public boolean equals(Object o) {
        boolean ris = false;
        if (o != null && this.getClass() == o.getClass()) {
            Poligono a = (Poligono) o;
            ris = (this.base == a.base && this.altezza == a.altezza);
        }
        return ris;
    }
}
