/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto.jwsilva
 */
public class Lampada {
    
    public boolean acesa;
    
    
    public void desligar(){
        if(acesa == true){
            acesa = false;
        }
        
    }
    
    public void ligar(){
        if(acesa == false){
            acesa = true;
        }
    }
    
    public void imprimiEstado(){
        if(acesa == true){
            System.out.println("A Lampada está acesa.");
            
        }else{
            System.out.println("A Lampada está apagada.");
        }
        
    }
}
