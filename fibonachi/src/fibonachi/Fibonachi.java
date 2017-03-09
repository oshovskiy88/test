/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonachi;

/**
 *
 * @author доця
 */

public class Fibonachi {
    public static Boolean isFib(int x){
        int a=0;
        int b=1;
        int f=1;
        while (b<x){
            f=a+b;
            a=b;
            b=f;
        }
        return x==f;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(isFib(5));
    }
    
}
