/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td01;

/**
 *
 * @author p1402690
 */
public class TD01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte b1 =10, b2 = 20;
        short p = 200;
        int n = 500;
        long q = 100;
        float x = 2.5f;
        double y = 5.25;
        
        System.out.println(b1+b2);          // addition => int (promotion numérique)
        System.out.println(p+b1);           // addition => int (promotion numérique)
        System.out.println(b1*b2);          // multiplication => int (promotion numérique)
        System.out.println(q+p*(b1+b2));    // addition => int (promotion numérique)/
                                            // multiplication => int (promotion numérique)/
                                            // addition => long (conversion d'ajustement)
        System.out.println(x+q*n);          // multiplication => long (conversion d'ajustement)/
                                            // addition => float (conversion d'ajustement)
        System.out.println(b1*q/x);         // multiplication => long (promotion numérique)/
                                            // division => float (conversion d'ajustement)
        System.out.println(b1*q*2./x);      // multiplication 1 => long (promotion numérique)/
                                            // multiplication 2 => double (conversion d'ajustement)/
                                            // division => double (conversion d'ajustement)
        System.out.println(b1*q*2.f/x);     // multiplication 1 => long (promotion numérique)/
                                            // multiplication 2 => float (conversion d'ajustement)/
                                            // division => float (conversion d'ajustement)
        
        
        char c = 60, ce = 'e', cg = 'g' ;
        byte b = 10 ;
        
        System.out.println(c+1);            // addition => int (promotion numérique)
        System.out.println(2*c);            // multiplication => int (promotion numérique)
        System.out.println(cg-ce);          // soustraction => int (promotion numérique)
        System.out.println(b*c);            // multiplication => int (promotion numérique)
        // TODO code application logic here
    }
    
}
