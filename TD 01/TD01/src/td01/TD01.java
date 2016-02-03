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
        
        System.out.println(b1+b2);
        System.out.println(p+b1);
        System.out.println(b1*b2);
        System.out.println(q+p*(b1+b2));
        System.out.println(x+q*n);
        System.out.println(b1*q/x);
        System.out.println(b1*q*2./x);
        System.out.println(b1*q*2.f/x);
        // TODO code application logic here
    }
    
}
