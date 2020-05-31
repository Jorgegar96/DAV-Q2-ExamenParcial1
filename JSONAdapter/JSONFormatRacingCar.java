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
public class JSONFormatRacingCar {
    
    private String JSONCar;
    
    public JSONFormatRacingCar(final String JSONCar){
        this.JSONCar = JSONCar;
    }

    public String getJSONCar() {
        return JSONCar;
    }

    public void setJSONCar(String JSONCar) {
        this.JSONCar = JSONCar;
    }
    
}
