
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
    
    //GLOBAL
     static Scanner input = new Scanner(System.in);
    //Posição na Lista
     static int position = 0;
    //Loop
     static boolean loop = true;
    //Tamanho Lista
     static int listSize = 3;
    public static void main(String[] args) {   
        String[] nameList = new String[listSize];
       
        do{
            menu(nameList);
        }while(loop);
    }
    
    public static void menu(String[] list){
        
        System.out.println("1 - Adicionar um novo nome\n" +
                            "2 - Apresentar os nomes\n" +
                            "3 - Pesquisar um nome\n" +
                            "4 - Remover um nome\n" +
                            "0 - Sair");
        
        int options = input.nextInt();
        
        
        switch(options){
            //0 - Sair
            case 0:
                shutdown();
                break;
            //1 - Adicionar um novo nome
            case 1:
                addNome(list,position,listSize);
                break;
            //2 - Apresentar os nomes 
            case 2:
                printList(list);
                break;
            //3 - Pesquisar um nome
            case 3:
                searchName(list);
                break;
            //4 - Remover um nome
            case 4:  
                deletName(list);
                break;
                
            default:
        }
    }
    
    public static void printList(String[] list){
        
        for(int i = 0; i < list.length;i++){
            if(!list.equals("") || list[i].isEmpty()){
            System.out.printf("Lista [%s]: %s\n",i+1,list[i]);
            }else{
            System.out.println("A lista está vazia.");                 
            }  
        }
    }
    
    public static void addNome(String[] list,int positionList,int size){
        
        if(position == size){
           System.out.println("A lista está cheia!!");
        }else{         
           System.out.println("Escreva um Nome:");
           String nomeAdd = input.next();

           if(checkName(list, nomeAdd)){
               list[position] = nomeAdd;
               System.out.println("Adicionado.");
               position++;
           }else{
                System.out.println("Nome já existe na lista!");   
           }

        }
        
    }
    
    public static boolean checkName(String[] list,String name){
        
        for(int i = 0; i < list.length;i++){        
            if(name.equals(list[i]))
                return false;
        }
        return true;
    }
    
    public static void deletName(String[] list){
        
        System.out.println("Digite o nome que deseja excluir: ");
        String nomeDel = input.next();
        
        for(int i = 0; i <= list.length;i++){
            if(nomeDel.equals(list[i])){
                list[i] = "";
                position--;
                restateList(list);
                System.out.println("Excluido.");
                break;
            }
            
            if(i == list.length){
                System.out.println("Nome não existe.");
            }
        }
    }
    
    public static void searchName(String[] list){
        System.out.println("Pesquisa\nDigite um Nome:");
        String name = input.next();
        
        for(int i = 0; i < list.length; i++){
            if(name.equals(list[i])){
                System.out.printf("Posição: Lista [%s]: %s\n",i+1,list[i]);
                break;
            }else
                System.out.println("Nome não existe.");
                break;
        }
    }
    
    public static void restateList(String[] list){
        for(int i = 0; i < list.length;i++){
            if(list[i].equals("") || list[i] == null){
                list[i] = list[i+1];
                list[i+1] = "";
                break;
            }
        }
    }
    
    public static void shutdown(){
        loop = false;
    }
}
            

