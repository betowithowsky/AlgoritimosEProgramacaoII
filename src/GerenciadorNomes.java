
import java.util.Scanner;
import javafx.application.ConditionalFeature;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto.jwsilva
 */
public class GerenciadorNomes {
     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        String[] listaNomes = new String[50];
        
        addNome(listaNomes);
        imprimiLista(listaNomes);
        
        
    }
    
    public static void imprimiLista(String[] lista){
        for(int i = 0; i < lista.length;i++){
            if(!lista.equals(""))
            System.out.printf("Lista [%s]: %s",i,lista[i]);
        }
    }
    
    public static void addNome(String[] lista){
        System.out.println("Escreva um Nome:");
        String nomeadd = input.nextLine();
        for(int i = 0; i < lista.length;i++){
            if(nomeadd == lista[i]){
                System.out.println("Nome Ja Existe!");
                break;
            }
            else{
                
                if(lista[i]!= null){               
                    lista[i] = nomeadd;
                }
                else
                    System.out.println("A Lista Está Cheia!");
        }
            }
        }
            
}
