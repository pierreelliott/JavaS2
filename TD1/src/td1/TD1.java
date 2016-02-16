/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td1;

/**
 *
 * @author p1502734
 */
public class TD1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    java.util.Scanner entree =new java.util.Scanner(System.in) ;
    System.out.println("Saissisez le montant souhaité:");
    int somme = entree.nextInt();
    int piece100, piece50, piece20, piece10, piece5;
    int cpt = 0;
    System.out.println("Voici les combinaisons:");
    stop: for (piece100 = 0; piece100 <= somme; piece100++)
    {
        for (piece50 = 0; 50*piece50+100*piece100 <= 100*somme; piece50++)
        {
            for (piece20 = 0; 20*piece20+50*piece50+100*piece100 <= 100*somme; piece20++)
            {
                for (piece10 = 0; 10*piece10+20*piece20+50*piece50+100*piece100 <= 100*somme; piece10++)
                {
                    piece5=(somme*100-(10*piece10+20*piece20+50*piece50+100*piece100))/5;
                    System.out.println( piece5 + " pièce(s) de 5 centimes " + piece10 + " pièce(s) de 10 centimes " + piece20 + " pièce(s) de 20 centimes " + piece50 + " pièce(s) de 50 centimes " + piece100 + " pièce(s) de 1 euro");
                    cpt++;
                    System.out.println("Continuer? o/n");
                    String rep = entree.next() ;
                    if( rep.charAt(0) == 'n' )
                        {
                            break stop ;
                        }
                }
            }
        }
    }
    System.out.println("Nombre de combinaisons: " + cpt);
        
    }
    
}
