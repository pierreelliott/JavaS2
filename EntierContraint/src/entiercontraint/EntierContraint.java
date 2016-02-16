/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entiercontraint;

/**
 *
 * @author p1502734
 */
public class EntierContraint {

    public EntierContraint(int min, int max, int val){
        if (min<=max)
        {
            this.min=min;
            this.max=max;
        }
        else
        {
            this.min=max;
            this.max=min;
        }
        if (ent<=this.max && ent>=this.min)
        {
            this.ent=ent;
        }
        if (ent>this.max)
        {
            this.ent=this.max;
        }
        if (ent<this.min)
        {
            this.ent=this.max;
        }
    }
    
    public void afficheEntier(int ent){
        System.out.println(ent);
    }
    
    public void saisirEntier(){
        java.util.Scanner entree =new java.util.Scanner(System.in) ;
        int saisie;
        do
        {
        System.out.println("Saisir une nouvelle valeur pour l'entier:");
        saisie = entree.nextInt();
        }
        while (saisie>this.max || saisie<this.min);
    }
    
    public void incrementationEntier(int i)
    {
        if(this.ent+i>this.max)
        {
            i=i-(this.max-this.ent);
            ent=this.min+i;            
        }

    }

    
    private final int min;
    private final int max;
    private int ent;
}
