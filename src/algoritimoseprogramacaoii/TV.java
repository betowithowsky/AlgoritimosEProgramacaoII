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
public class TV {
    private int canal = 0;
    private boolean onOff = false;
    private int volume = 0;
    
    
    public void setCanal(int canal){
        
        if(canal > 99){
            canal = 99;
        }
        else if(canal < 0){
            canal = 0;
        }
        
        this.canal = canal;
    }
    
    public void addVolume(){
        volume++;
    }
    
    public void removeVolume(){
        volume--;
    }
    
    public void ligaDesliga(){
        if(onOff == false){
            onOff = true;
        }        
        onOff = false;
    }
    
    public boolean getLigaDesliga(){
        return onOff;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public int getCanal(){
        return canal;
    }
    
}
