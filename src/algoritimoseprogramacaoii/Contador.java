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
public class Contador {
    private static int pos = 0;
    
    public static void Incrementar(){
        pos++;
    }
    
    public static void Zerar(){
        pos = 0;
    }
    
    public static int getNum(){
        return pos;
    }
}
