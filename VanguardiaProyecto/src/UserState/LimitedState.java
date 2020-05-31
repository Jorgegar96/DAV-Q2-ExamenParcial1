/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserState;

/**
 *
 * @author jorge
 */
public class LimitedState implements UserState{

    @Override
    public void action(User user) {
        user.login();
        user.listProducts();
        user.visualizeProduct();
        user.requestUpgrade();
        user.logout();
    }
    
}
