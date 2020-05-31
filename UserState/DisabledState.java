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
public class DisabledState implements UserState{

    @Override
    public void action(User user) {
        user.loginDenied();
    }
    
}
