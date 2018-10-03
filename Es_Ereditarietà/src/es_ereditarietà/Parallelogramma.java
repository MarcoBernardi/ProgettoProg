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
public class Parallelogramma  extends Poligono{
  
    
    
    public Parallelogramma(float base,float altezza){
        super(base,altezza,4);
    }
    
    @Override
    public float getArea(){
        return this.getBase()*this.getAltezza();
    }
}
