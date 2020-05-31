/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FifaFactory;

/**
 *
 * @author jorge
 */
public class Player {
    
    private PlayerPosition position;
    private String name;
    
    public Player(PlayerPosition position, String name){
        this.position=position;
        this.name=name;
    }

    public PlayerPosition getPosition() {
        return position;
    }

    public void setPosition(PlayerPosition position) {
        this.position = position;
        /*
        if(this.position.equals(PlayerPosition.FORWARD)){
            
        }else if(this.position.equals(PlayerPosition.MIDFIELDER)){
            
        }else if(this.position.equals(PlayerPosition.DEFENDER)){
            
        }else if(this.position.equals(PlayerPosition.GOALKEEPER)){
            
        }
        */
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
}
