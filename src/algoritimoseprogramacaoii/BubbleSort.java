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
public class BubbleSort {
    
    public static void main(String[] args) {
        String[] v = {"Withosky","Eduardo","Maria","João","Aecio","Vinicius", "Walendowsky"};
        
        ImprimiVetor(v);
        bubbleSort(v);
        ImprimiVetor(v);
          
    }
    
    public static void ImprimiVetor(String[] v){
        for(int i = 0; i < v.length ;i++){
            System.out.println(v[i] + "");
        }
        System.out.println("");
    }
    
    public static void bubbleSort(String[] v){
        for(int i = 0;i < v.length - 1; i++){
            for(int j = 0;j < v.length - i -1;j++){
                if(v[j].compareToIgnoreCase(v[j+1]) > 0){
                    troca(v, j, j+1);
                }
            }
        }
    }
    
    public static void troca(String[] v, int a,int b){
        String aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }
}
