/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimoseprogramacaoii;

/**
 *
 * @author roberto.jwsilva
 */
public interface Exercicio4_Recursao {
    public static void main(String[] args) {
        System.out.println(padovan(10));
    }
    
    static int padovan(int n){
        if(n < 0){
            return 0;
        }
            return padovan(n - 1) + padovan (n - 2);
    }   
}
