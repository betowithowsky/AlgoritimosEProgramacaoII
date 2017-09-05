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
public class Aluno {
    private String name;
    private double n1,n2,n3;
    
    public void setNome(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setNota(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota: ");
        n1 = input.nextDouble();
        System.out.println("Digite a Segunda Nota: ");
        n2 = input.nextDouble();
        System.out.println("Digite a Terceira Nota: ");
        n3 = input.nextDouble();    
    }
    
    public double getNota(){
        return (n1+n2+n3)/3;
    }
}
