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
    
}
