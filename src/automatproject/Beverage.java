/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatproject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author theresoula
 */
public class Beverage extends Item implements MethodsItem{
    
    //eget attribut
    public boolean tempBev; 
    
    public Beverage(String name, String color, char itemSize, int cost, boolean tempBev){
        super(name, color, itemSize, cost);
        this.tempBev = tempBev;
    }
    
    public void hotOrCold(){
        
        //Om boolean temperatur på beverage är lika med true
        if(tempBev){
            System.out.println("Be Careful! Beverage is HOT!"); 
            
        }else{ //false
            System.out.println("Beverage is ice cold!");
        }
    }

    @Override
    public void showItem() {
        
        System.out.println(name + " " + cost + " SEK");
        System.out.println("Size: " + itemSize);
        System.out.println("--- ---");
             
    }

    @Override
    public void buyItem() {
        
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter payment: ");
        int pay = scan.nextInt();
       
        if(cost == pay || cost < pay){
            
            System.out.println("Thank you!");
            
            if(cost < pay){
                System.out.println("Your change is " + (pay - cost));
                System.out.println("");
            }
            
            useItem();// Anropar funktionen att "använda varan" när betalning genomförts
            
        }else if (cost > pay) {
            System.out.println("Not enough cash");          
        }
        
        
    }

    @Override
    public void useItem() {
        
        hotOrCold(); // Anropar metod med boolean för att visa om dryck är varm eller kall  
        System.out.println("Enjoy your drink!");
    }
    
    public static void chooseItemToBuy(ArrayList<Beverage> bevs){
        
        Scanner scan = new Scanner(System.in);
        
        
        try{
            
        System.out.println("Choose item 1 - 3");
        int arrayNum = scan.nextInt();
            
        //---- Välja tröja och sedan betala ----   
        Beverage beverages = bevs.get(arrayNum -1);
        System.out.println("Selected item: " + beverages.name + " " + beverages.cost + " SEK");
        
        // --- Välja om användaren vill köpa vald vara
        System.out.println("Do you want to buy this item?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        
        int buySelected = scan.nextInt();
        
            switch(buySelected){
            
                case 1:
                //--- Hämtar tröjan ur lista efter användarens val och anropar metoden att köpa vara
                bevs.get(arrayNum -1).buyItem();
                break;
            
                case 2:
                //går ut ur switch case
                System.out.println("Välj i menyn");
                break;
                
                default:
            }
        
        }catch (Exception e){
            System.out.println("Item not find");
        }
        
    }
    
}
