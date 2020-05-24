/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventPlanningBuilder;

/**
 *
 * @author jorge
 */
public class Event {
    
    private String name;
    private int tableQuantity;
    private Color mainColor;
    private Flowers flowers;
    private int chairQuantity;
    private double totalPrice;
    
    @Override
    public String toString() {
        return (
            "Datos del Evento:\n" +
            "Nombre del Evento: " + this.name + "\n" +
            "Número de Mesas: " + this.tableQuantity + "\n" +
            "Color Principal: " + this.getMainColorString() + "\n" +
            "Flores: " + this.getFlowersString() + "\n" + 
            "Número de Sillas: " + this.chairQuantity + "\n" +
            "Costo Total: " + this.totalPrice + "\n"
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTableQuantity() {
        return tableQuantity;
    }

    public void setTableQuantity(int tableQuantity) {
        this.tableQuantity = tableQuantity;
    }

    public Color getMainColor() {
        return mainColor;
    }
    
    public String getMainColorString() {
        switch(this.mainColor){
            case BLUE:
                return "Blue";
            case WHITE:
                return "White";
            case GOLD: 
                return "Gold";
            case VIOLET: 
                return "Violet";
            case GRAY:
                return "Gray";
            case PINK:
                return "Pink";
            case GREEN:
                return "Green";
            default:
                return "N/A";
        }
    }

    public void setMainColor(Color mainColor) {
        this.mainColor = mainColor;
    }

    public Flowers getFlowers() {
        return flowers;
    }
    
    public String getFlowersString() {
        switch(this.flowers){
            case CHERRY_BLOSSOMS:
                return "Cherry Blossoms";
            case ROSES:
                return "Roses";
            case ORCHIDS:
                return "Orchids";
            case TULIPS:
                return "Tulips";
            case BELLS_OF_IRELAND:
                return "Bells of Ireland";
            default:
                return "N/A";
        }
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public int getChairQuantity() {
        return chairQuantity;
    }

    public void setChairQuantity(int chairQuantity) {
        this.chairQuantity = chairQuantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    
}
