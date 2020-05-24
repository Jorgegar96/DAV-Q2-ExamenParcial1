/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONAdapter;

/**
 *
 * @author jorge
 */
public class AbstractRacingCar implements RacingCar{
    
    private int maxSpeed;
    private String model;
    private String year;
    private boolean fitToRace;
    
    public AbstractRacingCar(){}
    
    public AbstractRacingCar(
            int maxSpeed, String model, String year, boolean fitToRace
    ){
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.year = year;
        this.fitToRace = fitToRace;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getYear() {
        return this.year;
    }

    @Override
    public boolean fitToRace() {
        return this.fitToRace;
    }

    public void setFitToRace(boolean fitToRace) {
        this.fitToRace = fitToRace;
    }
    
    @Override
    public String toString(){
        String puedeCorrer = fitToRace() ? "Puede Correr" : "No Puede Correr";
        return (
                getClass().getSimpleName() + ":\n" +
                "Velocidad Máxima: " + getMaxSpeed() + "km/h\n" +
                "Modelo: " + getModel() + "\n" +
                "Año: " + getYear() + "\n" +
                puedeCorrer + "\n"
        ); 
    }
    
}
