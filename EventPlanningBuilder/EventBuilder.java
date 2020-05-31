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
public interface EventBuilder {
    public abstract void addName(String name);
    public abstract void addTableQuantity(int tableQuantity);
    public abstract void addMainColor(Color mainColor);
    public abstract void addFlowers(Flowers flowers);
    public abstract void addChairQuantity(int chairQuantity);
    public abstract void addTotalCost(float totalCost);
    public abstract Event getEvent();
}
