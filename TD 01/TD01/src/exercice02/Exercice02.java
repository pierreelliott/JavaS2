/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice02;

/**
 *
 * @author p1402690
 */
public class Exercice02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x1 = 1e200, x2 = 1e210 ;
        double y, z ;
        
     
        y = x1 * x2;
        x2 = x1;
        z = y / (x2-x1);
        System.out.println(y + " divise par " + (x2-x1) + " = " + z);
        y = 1;
        z = y / (x2-x1);
        System.out.println(y + " divise par " + (x2-x1) + " = " + z);
        z = (x2-x1)/ (x2-x1);
        System.out.println((x2-x1) + " divise par " + (x2-x1) + " = " + z);
        System.out.println(z+ " + " + 1 + " = " + (z+1));
        
        
        /* Résultats */
        
        /*Infinity divise par 0.0 = Infinity
                => débordement sur l'exposant
                => puis division par 0
        1.0 divise par 0.0 = Infinity
                => division par 0
        0.0 divise par 0.0 = NaN
                => division de 0 par 0
        NaN + 1 = NaN
                => opération avec un NaN*/
        
        // TODO code application logic here
    }
    
}
