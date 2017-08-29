
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author roberto.jwsilva
 */
public class CriaLampada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lampada l1 = new Lampada();
        
        System.out.println("1 - Liga / 2 - Desliga");
        int estado = input.nextInt();
        
        switch(estado){
            case 1:
                l1.ligar();
                break;
            case 2:
                l1.desligar();
                break;
                
        }

        l1.imprimiEstado();
    }
}
