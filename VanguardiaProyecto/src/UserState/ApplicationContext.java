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
public class ApplicationContext {
    
    private UserState state = null;
    private User user = new User();
    
    public void setState(UserState state){
        this.state = state;
    }
    
    public void userAction(){
        state.action(user);
    }
}
