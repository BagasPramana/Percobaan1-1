/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author hp
 */
public class Barrier implements Destroyable{
    private int strength;          
    public Barrier (int strength){         
        this.strength = strength; 
        System.out.print("Hayo");    
    }          
    public void setStrength (int strength){         
        this.strength = strength;     
    }          
    public int getStrength (){         
        return strength;     
    }          
    public void destroy(){         
        strength -= strength*0.1;     
    }          
    public void destroyed(){         
        destroy();     
    }          
    public String getBarrierInfo(){         
        return "\nBarrier Strength = "+strength+"\n";     
    }
    
  
}
