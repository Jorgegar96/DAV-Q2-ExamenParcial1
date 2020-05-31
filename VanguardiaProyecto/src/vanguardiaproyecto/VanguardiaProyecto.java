/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vanguardiaproyecto;
import SpotifySingleton.SpotifySingleton;
import FifaFactory.*;
import InstagramObserver.*;
/*
import EventPlanningBuilder.*;
import JSONAdapter.*;
import UserState.*;
/*
/**
 *
 * @author jorge
 */
public class VanguardiaProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       //Implementacion de instanciad de Spotify con Singleton
        SpotifySingleton();
       
        //Implementacion de Creacion de jugador de fifa con Factory
        PlayerFactory();
        
        //Implementacion de Instagram con Observer
        InstagramObserver();
        /*
        //Implementacion de Event Builder
        EventBuilder();
        
        //Implementacion de JSON Adapter
        JSONAdapter();
        
        //Implementavcion de Application User State
        AppUserState();
        */
    }
    
    public static void SpotifySingleton(){
        
        System.out.println("Spotify Singleton:");
        
        SpotifySingleton spotifyInstance = SpotifySingleton.getInstance();
        spotifyInstance.PlaySong("Wish You Were Here from Pink Floyd");
        
        System.out.println("-----------------------------------------------\n");
    }
    
    
    public static void PlayerFactory(){
        
        System.out.println("Fifa Player Factory:");
        
        //Implementacion de Creacion de jugador de fifa con factory
        PlayerFactory playerFactory = new PlayerFactory();
        Player forward = playerFactory.createPlayer(
                PlayerPosition.FORWARD,
                "Lionel Messi"
        );
        System.out.println("Name: " + forward.getName() + ", Pos: " + forward.getPosition());
        
        Player midfielder = playerFactory.createPlayer(
                PlayerPosition.MIDFIELDER,
                "Marco Reus"
        );
        System.out.println("Name: " + midfielder.getName() + ", Pos: " + midfielder.getPosition());
        
        Player defender = playerFactory.createPlayer(
                PlayerPosition.DEFENDER,
                "Marvin Plattenhardt"
        );
        System.out.println("Name: " + defender.getName() + ", Pos: " + defender.getPosition());
        
        Player goalkeeper = playerFactory.createPlayer(
                PlayerPosition.GOALKEEPER,
                "Manuel Neuer"
        );
        System.out.println("Name: " + goalkeeper.getName() + ", Pos: " + goalkeeper.getPosition());
        
        System.out.println("-----------------------------------------------\n");
    }
    
    public static void InstagramObserver(){
        
        System.out.println("Instagram Observer: ");
        
        //Implementacion de Instagram con Observer
        InstagramPage instagramPage = new InstagramPage();
        instagramPage.registerObserver(new Follower("Samuel Flores", 21));
        instagramPage.registerObserver(new Follower("Eduardo Maradiaga",23));
        instagramPage.registerObserver(new Follower("Alex Banegas",19));
        instagramPage.registerObserver(new Follower("Martín Hernández",27));
        
        instagramPage.addPost("Foto del muro de Berlín");
        instagramPage.addPost("Video de Roatán");
        instagramPage.addPost("Foto de Pasteles");
        
        System.out.println("-----------------------------------------------\n");
    }
    /*
    public static void EventBuilder(){
        
        System.out.println("Event Builder: ");
        
        //Implementacion de Event Builder
        EventBuilder eventBuilder = new MainHallEventBuilder();
        EventPlanner eventPlanner = new EventPlanner();
        eventPlanner.planEvent(eventBuilder);
        
        Event event = eventBuilder.getEvent();
        System.out.println(event.toString());
        
        System.out.println("-----------------------------------------------\n");
    }
    
    public static void JSONAdapter(){
        
        System.out.println("JSON Racing Car Adapter: \n");
        
        //Implementacion de JSON Adapter
        
        System.out.println(
                "***Ejemplo de Super Carro Almacendo en Formato de Objeto***"
        );
        SuperCar superCar = new SuperCar(400, "R8", "2019", true);
        System.out.println(superCar.toString());
        
        System.out.println("Modificando el estado del carro...\n");
        superCar.setFitToRace(false);
        System.out.println(superCar.toString());
        
        System.out.println(
                "***Ejemplo de Carro Deportivo Almacendo en Formato de Objeto***"
        );
        SportsCar sportsCar = new SportsCar(260, "Camaro", "2016", true);
        System.out.println(sportsCar.toString());
        
        System.out.println("Modificando el estado del carro...\n");
        sportsCar.setFitToRace(false);
        System.out.println(sportsCar.toString());
        
        System.out.println(
                "***Ejemplo de Carro Almacendo en Formato JSON***"
        );
        String JSONCar = (
                "{\n"
                + "'maxSpeed':'300',\n"
                + "'model':'DB9',\n"
                + "'year':'2020',\n"
                + "'fitToRace':'true'\n"
                + "}"
        );
        RacingCarAdapter rca = new RacingCarAdapter(new JSONFormatRacingCar(JSONCar));
        System.out.println(rca.toString());
        
        System.out.println("Modificando el estado del carro...\n");
        rca.setFitToRace(false);
        System.out.println(rca.toString());
        
        System.out.println("-----------------------------------------------\n");
    }
    
    public static void AppUserState(){
        
        System.out.println("Application User State:\n");
        
        //Implementavcion de Application User State
        ApplicationContext context = new ApplicationContext();
        
        System.out.println(
                "***Ejemplo de Usuario con acceso Completo Habilitado***"
        );
        context.setState(new EnabledState());
        context.userAction();
        System.out.println("");
        
        System.out.println(
                "***Ejemplo de Usuario con acceso Limitado***"
        );
        context.setState(new LimitedState());
        context.userAction();
        System.out.println("");
        
        System.out.println(
                "***Ejemplo de Usuario con acceso Deshabilitado***"
        );
        context.setState(new DisabledState());
        context.userAction();
        System.out.println("");
        
        System.out.println("-----------------------------------------------\n");
    }
    */
}
