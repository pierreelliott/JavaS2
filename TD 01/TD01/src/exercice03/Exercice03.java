/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice03;

/**
 *
 * @author p1402690
 */
public class Exercice03 {
    
        public static void main(String[] args) {
            
            int i=10, j=5 ;
            
            if(i<5 && j++<10) System.out.println("vrai");
            else System.out.println("faux");
            
            System.out.println("i="+i+" ; j="+j) ;
            
            // Faux : i = 10 , j = 5

            
            if(i<5 & j++<10) System.out.println("vrai");
            else System.out.println("faux");

            System.out.println("i=" + i+ " ; j=" + j) ;
            
            // Faux : i = 10 , j = 6

            
            if(i<15 && j++<10) System.out.println("vrai");
            else System.out.println("faux");

            System.out.println("i=" + i+ " ; j=" + j) ;
            
            // Vrai : i = 10 , j = 7

            
            if(i<15 || j++<10) System.out.println("vrai");
            else System.out.println("faux");

            System.out.println("i=" + i + " ; j=" + j) ;
            
            // Vrai : i = 10 , j = 7
            

            if(i<5 || j++<10) System.out.println("vrai");
            else System.out.println("faux");

            System.out.println("i=" + i + " ; j=" + j) ;
            
            // Vrai : i = 10 , j = 8
            

            if(i<15 | j++<10) System.out.println("vrai");
            else System.out.println("faux");

            System.out.println("i=" + i + " ; j=" + j) ;
            
            // Vrai : i = 10 , j = 9
            
        }
}
