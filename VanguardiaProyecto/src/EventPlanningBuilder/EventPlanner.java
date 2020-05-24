/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventPlanningBuilder;

import java.util.Scanner;



/**
 *
 * @author jorge
 */
public class EventPlanner {
    
    Scanner sc = new Scanner(System.in);
    
    public void planEvent(EventBuilder eventBuilder){
        
        System.out.println("Ingrese el nombre del evento: ");
        eventBuilder.addName(sc.nextLine());
        
        System.out.println(
                "Seleccione el número total de mesas:\n" +
                "1) 10\n" +
                "2) 15\n" +
                "3) 25\n" +
                "4) 30\n"
        );
        
        int tablesOption = sc.nextInt();
        int tables = 0;
        
        switch(tablesOption){
            case 1:
                tables = 10;
                break;
            case 2:
                tables = 15;
                break;
            case 3:
                tables = 25;
                break;
            case 4:
                tables = 30;
                break;
            default:
                tables = 15;
                break;
        }
        
        eventBuilder.addTableQuantity(tables);
        eventBuilder.addChairQuantity(tables * 10);
        
        System.out.println(
                "Seleccion el color principal:\n" +
                "1) Azul\n" +
                "2) Blanco\n" +
                "3) Dorado\n" +
                "4) Violeta\n" +
                "5) Gris\n" +
                "6) Rosado\n" +
                "7) Verde\n"
        );
                
        switch(sc.nextInt()){
            case 1:
                eventBuilder.addMainColor(Color.BLUE);
                break;
            case 2:
                eventBuilder.addMainColor(Color.WHITE);
                break;
            case 3:
                eventBuilder.addMainColor(Color.GOLD);
                break;
            case 4:
                eventBuilder.addMainColor(Color.VIOLET);
                break;
            case 5:
                eventBuilder.addMainColor(Color.GRAY);
                break;
            case 6:
                eventBuilder.addMainColor(Color.PINK);
                break;
            case 7:
                eventBuilder.addMainColor(Color.GREEN);
                break;
            default:
                eventBuilder.addMainColor(Color.BLUE);
                break;
        }
        
        System.out.println(
                "Seleccion el color principal:\n" +
                "1) Cherry Blossoms\n" +
                "2) Roses\n" +
                "3) Orchids\n" +
                "4) Tulips\n" +
                "5) Bells of Ireland\n"
        );
        
        switch(sc.nextInt()){
            case 1:
                eventBuilder.addFlowers(Flowers.CHERRY_BLOSSOMS);
                break;
            case 2:
                eventBuilder.addFlowers(Flowers.ROSES);
                break;
            case 3:
                eventBuilder.addFlowers(Flowers.ORCHIDS);
                break;
            case 4:
                eventBuilder.addFlowers(Flowers.TULIPS);
                break;
            case 5:
                eventBuilder.addFlowers(Flowers.BELLS_OF_IRELAND);
                break;
            default:
                eventBuilder.addFlowers(Flowers.CHERRY_BLOSSOMS);
                break;
        }
        
        eventBuilder.addTotalCost(1500 + tables*70);
    }
    
}
