/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatproject;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author theresoula
 */
public class AutomatProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           
        // Lista för drycker respektive tröjor
        ArrayList<Beverage> bevs = new ArrayList<>();
        
        bevs.add(new Beverage("Coffee", "Black", 'G', 35, true));
        bevs.add(new Beverage("Nitro Cold Brew", "Color", 'T', 45, false));
        bevs.add(new Beverage("Cafe latte", "Color", 'V', 55, true));
        
        ArrayList<Sweater> sevs = new ArrayList<>();
        
        sevs.add(new Sweater("T shirt COS", "White", 'M', 250));
        sevs.add(new Sweater("T shirt COS", "Grey", 'S', 250));
        sevs.add(new Sweater("Cardigan Arken", "Brown", 'M', 750));
       
        
        
        // ---- Startar programmet---- 
        System.out.println("Welcome to the Awsome Automat Shop!");
        System.out.println("");
        
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        
        //Meny val för användare tills användare väljer 5 för Exit 
        while(menu!=5){
          
        System.out.println("[1] Show all products");
        System.out.println("[2] Select Beverages");
        System.out.println("[3] Select Sweaters");
        System.out.println("[4] Buy products");
        System.out.println("[5] Exit Automat Shop");
        
        // Användaren väljer i menyn genom att skriva in 1-5
        menu = scan.nextInt();
        
        switch (menu){
            case 1:
                showAll(bevs, sevs);
                break;
            case 2:
                showBeverage(bevs);
                Beverage.chooseItemToBuy(bevs);
                break;       
            case 3:
                showSweater(sevs);
                Sweater.chooseItemToBuy(sevs);
                break;
            case 4:
                 //chooseBeverageToBuy(bevs);                 
                break;
            case 5:
                System.out.println("Thanks for visiting Automat Shop");
                //System.exit(0);
                break;    
            default:
                System.out.println("Please enter a number between 1-4 to choose in the menu or 5 to exit"); 
            }
       }
        
         
    }
    
   
    public static void showAll(ArrayList<Beverage> bevs, ArrayList<Sweater> sevs){
            
            for(Beverage i: bevs){
            i.showItem();
            } 
        
            for(Sweater i: sevs){
            i.showItem();
            }
           
    }
    
    
    public static void showBeverage(ArrayList<Beverage> bevs){
            for(Beverage i: bevs){
                i.showItem();
            }
    }
    
    
    public static void showSweater(ArrayList<Sweater> sevs){
            for(Sweater i: sevs){
                i.showItem();
            }
    }
    
    
            
}
