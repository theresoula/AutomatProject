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
                break;       
            case 3:
                showSweater(sevs);
                break;
            case 4:
                 chooseItemToBuy(bevs, sevs);                 
                break;
            case 5:
                System.out.println("Thanks for visiting Automat Shop");
                //System.exit(0);
                break;    
            default:
                System.out.println("Please enter a number between 1-5 to choose in the menu"); 
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
    
    
    public static void chooseItemToBuy(ArrayList<Beverage> bevs, ArrayList<Sweater> sevs){
        
        Scanner scan = new Scanner(System.in);
        /*
        int buy = 0;
        
        while(buy!=2) {
        System.out.println("Choose 1-2");
        buy = scan.nextInt();
        
        switch(buy){
            case 1:
                System.out.println("hej");
                break;
            case 2:
                System.out.println("då");
                break;
        }
        */
        
        System.out.println("Choose item 1 - 3");
        int arrayNum = scan.nextInt();
        
        /*if(arrayNum > bevs.size()) {
            throw new ArrayIndexOutOfBoundsException("");
        }*/
       
        //if(arrayNum > sevs.size()){
        
        //}
        
        /*try {
            
        int arrayNum => sevs.size();
        }catch(ArrayIndexOutOfBoundsException e){
        
        }*/
        
        
        // ---- Välja dryck och betala-----
        //Beverage beverage = bevs.get(arrayNum -1);
        //System.out.println("Selected item: " + beverage.name);
        
        //---Hämtar dryck ur lista efter användarens val och anropar metoden att köpa vara
        //bevs.get(arrayNum -1).buyItem();
        
        //----- Välja tröja och sedan betala----
        Sweater sweaters = sevs.get(arrayNum -1);
        System.out.println("Selected item: " + sweaters.name + " " + sweaters.cost + " SEK");
        
        //---Hämtar tröjan ur lista efter användarens val och anropar metoden att köpa vara
        sevs.get(arrayNum -1).buyItem();
        

        }
        
            
}
