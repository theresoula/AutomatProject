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
    
    public static void chooseItemToBuy(ArrayList<Sweater> sevs){
        
        Scanner scan = new Scanner(System.in);
      
        try{
            
        System.out.println("Choose item 1 - 3");
        int arrayNum = scan.nextInt();
            
        //---- Välja tröja och sedan betala ----   
        Sweater sweaters = sevs.get(arrayNum -1);
        System.out.println("Selected item: " + sweaters.name + " " + sweaters.cost + " SEK");
        
        // --- Välja om användaren vill köpa vald vara
        System.out.println("Do you want to buy this item?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");
        
        int buySelected = scan.nextInt();
        
            switch(buySelected){
            
                case 1:
                //--- Hämtar tröjan ur lista efter användarens val och anropar metoden att köpa vara
                sevs.get(arrayNum -1).buyItem();
                break;
            
                case 2:
                //går ut ur switch case
                System.out.println("Välj i menyn");
                break;
                default:
                // vet ej om denna är nödvändig vid try/catch exception
            }
        
        }catch (Exception e){
            System.out.println("Item not find or something else went wrong, please try again!");
        }
       
    }
}
