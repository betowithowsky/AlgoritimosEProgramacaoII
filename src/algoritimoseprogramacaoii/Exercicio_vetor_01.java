/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimoseprogramacaoii;

import java.util.Random;

/**
 *
 * @author roberto.jwsilva
 */
public class Exercicio_vetor_01 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        populaVetor(vetor);
        imprimiVetor(vetor);
        trocaValores(vetor);
        imprimiVetor(vetor);
        
    }
    
    
    public static void populaVetor(int[] v){
            Random rnum = new Random();
            for(int i = 0; i < v.length;i++){
                v[i] = rnum.nextInt(11);
            }
    }
    
    public static boolean ehPar(int n){
        boolean ehpar = n % 2 == 0;
        return ehpar;
    }
    
    public static void trocaValores(int[] v){
        for(int i = 0; i < v.length;i++){
            if(ehPar(v[i])){
                v[i] = 0;
            }else
                v[i] = 1;
        }
    }
    
    public static void imprimiVetor(int[] v){
        for(int i =0;i<v.length;i++){
            System.err.println("vetor["+i+"]:" +v[i]);
        }
        
    }
}
