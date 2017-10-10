/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimoseprogramacaoii;

import java.util.Scanner;

/**
 *
 * @author roberto.jwsilva
 */
public class ExemploRecursao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero Natural:");
        int num = input.nextInt();
        int fatorial = fat(num);
        System.out.println("Fatoria: " + fatorial);
    }
    
    static int fat(int num){
        if(num ==0){
            return 1;
        }
        return num * fat (num -1);
    }
}
