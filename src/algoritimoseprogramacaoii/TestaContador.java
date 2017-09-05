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
public class TestaContador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Contador count = new Contador();
        
        
        while(true){
            System.out.println("1 = incrementar\n2 = zerar\n3 = retornaValor");
            int in = input.nextInt();
            switch(in){
                case 1:
                    count.Incrementar();
                    break;
                case 2:
                    count.Zerar();
                    break;
                case 3:
                    System.out.println("Contador: " + count.getNum());
                    break;  
                default:
                    break;
            }
        }
    }
}
