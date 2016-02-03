/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice04;

/**
 *
 * @author p1402690
 */
public class Exercice04 {
    
            
            public static void main(String[]args)
            {
                int n=0;
                do
                {
                    if(n%2==0)
                    {
                        System.out.println(n + " est pair") ;
                        n += 3 ;
                        continue ;
                    }

                    if(n%3==0)
                    {
                        System.out.println(n + " est multiple de 3") ;
                        n += 5 ;
                    }

                    if(n%5==0)
                    {
                        System.out.println(n + " est multiple de 5") ;
                        break ;
                    }
                
                    n += 1 ;
                }while(true) ;
            }
    
}


/* Résultats */

// n = 0
// Boucle
        // 0%2 == 0
                // 0 est pair
                // n = 3
/* Continue permet de passer au tour de boucle suivant */
// Boucle
        // 3%2 != 0
        // 3%3 == 0
                // 3 est multiple de 3
                // n = 8
        // 8%5 != 0
        // n = 9
// Boucle
        // 9%2 != 0
        // 9%3 == 0
                // 9 est multiple de 3
                // n = 14
        // 14%5 != 0
        // n = 15
// Boucle
        // 15%2 != 0
        // 15%3 == 0
                // 15 est multiple de 3
                // n = 20
        // 20%5 == 0
                // 20 est multiple de 5
// Sortie boucle
// Fin programme