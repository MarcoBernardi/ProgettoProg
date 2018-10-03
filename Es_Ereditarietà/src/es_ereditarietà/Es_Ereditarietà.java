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
public class Es_Ereditarietà {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Geometrie g= new Geometrie();
        
        g.InsertPoligono(19, 6,"rettangolo");
        g.InsertPoligono(7,12, "rettangolo");
        g.InsertPoligono(4, 4, "triangolo");
        g.InsertPoligono(4, 4, "triangolo");
        g.printAree();
        System.out.println("Numero elementi:" + g.getNumElem());

        // commento di ste
        
    }
    
}
