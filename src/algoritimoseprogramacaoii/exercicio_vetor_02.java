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
public class exercicio_vetor_02 {
    public static void main(String[] args) {
        int[] vetor = {5,8,9,1,-3,2,7};
        
        System.err.println(retornaMenor(vetor));
        
    }
    
    public static int retornaMenor(int[] v){
        int menor = 0;
        for(int i = 0;i < v.length;i++){
           if(menor >= v[i]){
               menor = v[i];
           } 
        }
        return menor;
    }
}
