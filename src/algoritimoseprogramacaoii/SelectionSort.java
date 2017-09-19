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
public class SelectionSort {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        populaVetor(numeros);
        imprimiVetor(numeros);
        selectionSort(numeros);
        imprimiVetor(numeros);
    }
    
    static void populaVetor(int[] v){
        Random gerador = new Random();
        
        for(int i = 0; i < v.length;i++){
            int num = gerador.nextInt(100);
            v[i] = num;
        }
    }
    
    static void selectionSort(int[] v){
        for(int i = 0;i < v.length - 1;i++){
            int min = i;
            for(int j = (i+1); j < v.length;j++){
                if(v[j] > v[min]){
                    min = j;
                }                
            }
            if(i != min){
                troca(v,i,min);
            }
        }
    }
    
    static void troca(int[] v,int a, int b){
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }
    
    static void imprimiVetor(int[] v){
        for(int i = 0; i < v.length;i++){
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
}
