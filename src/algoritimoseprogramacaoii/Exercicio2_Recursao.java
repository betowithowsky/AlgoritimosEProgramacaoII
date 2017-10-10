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
public class Exercicio2_Recursao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero Natural:");
        int num = input.nextInt();
        bin(num);
        System.out.println();
    }
    
    static void bin(int num){
                
        if(num < 2){
            System.out.print(num);
            return;
        }
        bin (num / 2);
        System.out.print(num % 2);
    }
}
