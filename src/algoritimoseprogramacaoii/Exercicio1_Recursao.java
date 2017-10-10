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
public class Exercicio1_Recursao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero Natural:");
        int b = input.nextInt();
        System.out.println("Expoente");
        int e = input.nextInt();
        double potencia = potencia(b, e);
        System.out.println("Potencia: " + potencia);
    }
    
    static double potencia(int b, int e){
        if(e == 0){
            return 1;
        }
        return b * potencia (b, e - 1);
    }
}
