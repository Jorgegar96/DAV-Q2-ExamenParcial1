/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InstagramObserver;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class InstagramPage implements Subject{
    
    private ArrayList<String> posts;
    private ArrayList<Observer> followers;
    
    public InstagramPage(){
        this.posts = new ArrayList<String>();
        this.followers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.followers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.followers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : this.followers) {
            observer.update(this);
        }
    }
 
    public void addPost(String post){
        this.posts.add(post);
        this.notifyAllObservers();
    }
    
    public ArrayList<String> getPosts(){
        return this.posts;
    }
    
    public String toString(){
        return posts.toString();
    }
}
