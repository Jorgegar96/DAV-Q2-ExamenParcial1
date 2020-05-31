/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstagramObserver;

/**
 *
 * @author jorge
 */
public class Follower implements Observer{
    
    private String name;
    private int age;
    
    public Follower(String name, int age){
        this.age=age;
        this.name=name;
    }
    
    public void update(Subject subject){
        System.out.println("Se le ha notificado a " + this.name + " sobre una nueva publicación");
        System.out.println(subject);
    }
    
}
