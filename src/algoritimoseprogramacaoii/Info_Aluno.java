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
public class Info_Aluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno aluno = new Aluno();
        
        while(true){
        System.out.println("1 = Escreve o Nome do Aluno\n2 = Escreve notas\n3 = retornaValores");
            int in = input.nextInt();
            switch(in){
                case 1:
                    System.out.println("Escreva o Nome do Aluno:");
                    String nome = input.next();
                    aluno.setNome(nome);
                    break;
                case 2:
                    aluno.setNota();
                    break;
                case 3:
                    System.out.println("Nome: " + aluno.getName());
                    System.out.println("Média: " + aluno.getNota());
                    break;  
                default:
                    break;
            }
        }
    }
}
