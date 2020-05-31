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
public class PlayerFactory {
    
    public Player createPlayer(PlayerPosition position, String name){
        switch (position) {
            case FORWARD:
                return new Forward(name);
            case MIDFIELDER:
                return new Midfielder(name);
            case DEFENDER:
                return new Defender(name);
            case GOALKEEPER:
                return new Goalkeeper(name);
            default:
                return new Player(position, name);
        }
    }
    
}
