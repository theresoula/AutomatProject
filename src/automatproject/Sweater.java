/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatproject;

import java.util.Scanner;

/**
 *
 * @author theresoula
 */
public class Sweater extends Item implements MethodsItem{
    
    public Sweater(String name, String color, char itemSize, int cost){
        super(name, color, itemSize, cost);
    }

    @Override
    public void showItem() {
        
        System.out.println(name + " " + cost + " SEK");
        System.out.println("Size: " + itemSize);
        System.out.println("Color: " + color);
        System.out.println("--- ---");
    }
    

    @Override
    public void buyItem() {
        
        Scanner scan = new Scanner(System.in);
        
        // --- Användaren betalar ----
        System.out.println("Enter payment: ");
        int pay = scan.nextInt();
        
        // Conditions om summan är över kostnaden, visa växel. För lite pengar, ge felmeddelande
        if(cost == pay || cost < pay){
            
            System.out.println("Thank you!");
            
            if(cost < pay){
                System.out.println("Your change is " + (pay - cost)+ " SEK");
                System.out.println("");
            }
            
            useItem(); // Anropar funktionen att "använda varan" när betalning genomförts
            
        }else if (cost > pay) {
            System.out.println("Not enough cash, please try again");          
        }
        
    }
    

    @Override
    public void useItem() {
        System.out.println("Try it on, you'll look smashing!");
        System.out.println("");
    }
    
}
