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
public class EnabledState implements UserState{

    @Override
    public void action(User user) {
        
        user.login();
        user.createProduct();
        user.listProducts();
        user.visualizeProduct();
        user.modifyProduct();
        user.deleteProduct();
        user.logout();
        
    }
    
}
