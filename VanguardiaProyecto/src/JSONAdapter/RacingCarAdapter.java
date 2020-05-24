/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSONAdapter;

import java.util.ArrayList;

/**
 *
 * @author jorge
 */
public class RacingCarAdapter extends AbstractRacingCar{
    
    private JSONFormatRacingCar jsonRacingCar;
    
    public RacingCarAdapter(final JSONFormatRacingCar jsonRacingCar){
        super();
        this.jsonRacingCar = jsonRacingCar;
    }
    
    private ArrayList<String> jsonParser(String jsonCar){
        ArrayList<String> attributes = new ArrayList<String>();
        jsonCar = jsonCar.trim();
        jsonCar = jsonCar.substring(1, jsonCar.length()-1);
        String[] stringAttributes = jsonCar.split(",");
        for (String stringAttribute : stringAttributes) {
            stringAttribute = stringAttribute.trim();
            String[] data = stringAttribute.split(":");
            /*
            for (String string : data) {
                string = string.trim();
                string = string.substring(1, string.length()-2);
            }
            */
            attributes.add(data[1].trim().substring(1,data[1].length()-1));
            /*
            if(data[0].equalsIgnoreCase("maxSpeed")){
                
            }else if(data[0].equalsIgnoreCase("model")){
                
            }else if(data[0].equalsIgnoreCase("year")){
                
            }else if(data[0].equalsIgnoreCase("fitToRace")){
                
            }
            */
        }
        return attributes;
    }
    
    @Override
    public int getMaxSpeed() {
        return Integer.parseInt(jsonParser(this.jsonRacingCar.getJSONCar()).get(0));
    }

    @Override
    public String getModel() {
        return jsonParser(this.jsonRacingCar.getJSONCar()).get(1);
    }

    @Override
    public String getYear() {
        return jsonParser(this.jsonRacingCar.getJSONCar()).get(2);
    }

    @Override
    public boolean fitToRace() {
        return Boolean.parseBoolean(jsonParser(this.jsonRacingCar.getJSONCar()).get(3));
    }
    
    @Override
    public void setFitToRace(boolean fitToRace) {
        ArrayList<String> attributes = jsonParser(this.jsonRacingCar.getJSONCar());
        String JSONCar = (
                "{"
                + "'maxSpeed':'" + attributes.get(0) + "',"
                + "'model':'" + attributes.get(1) + "',"
                + "'year':'" + attributes.get(2) + "',"
                + "'fitToRace':'" + fitToRace + "'"
                + "}"
        );
        this.jsonRacingCar.setJSONCar(JSONCar);
    }
}
