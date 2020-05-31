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
public class MainHallEventBuilder implements EventBuilder{

    private Event event = new Event();
    
    @Override
    public void addName(String name) {
        this.event.setName(name);
    }

    @Override
    public void addTableQuantity(int tableQuantity) {
        this.event.setTableQuantity(tableQuantity);
    }

    @Override
    public void addMainColor(Color mainColor) {
        this.event.setMainColor(mainColor);
    }

    @Override
    public void addFlowers(Flowers flowers) {
        this.event.setFlowers(flowers);
    }

    @Override
    public void addChairQuantity(int chairQuantity) {
        this.event.setChairQuantity(chairQuantity);
    }

    @Override
    public Event getEvent() {
        return this.event;
    }

    @Override
    public void addTotalCost(float totalCost) {
        this.event.setTotalPrice(totalCost);
    }
    
}
