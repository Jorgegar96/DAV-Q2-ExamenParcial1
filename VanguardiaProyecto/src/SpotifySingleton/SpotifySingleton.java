/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpotifySingleton;

/**
 *
 * @author jorge
 */
public class SpotifySingleton {
    
    private static volatile SpotifySingleton instance;
    
    private SpotifySingleton() {
    }
    
    public static SpotifySingleton getInstance(){
        if(instance == null){
            synchronized(SpotifySingleton.class){
                if(instance == null){
                    instance = new SpotifySingleton();
                    System.out.println("Se ha inicializado una instancia de Spotify");
                }
            }
        }
        System.out.println("Se retornará la instancia de Spotify");
        return instance;
    }
    
    public void PlaySong(String songname){
        System.out.println("Now Playing: " + songname + ", enjoy!");
    }
}
