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
        
   
        //Lista av beverage och sweaters
        ArrayList<Beverage> bevs = new ArrayList<>();
        bevs.add(new Beverage("Coffee", "Black", 'G', 35, true));
        bevs.add(new Beverage("Nitro Cold Brew", "Color", 'T', 45, false));
        
        ArrayList<Sweater> sevs = new ArrayList<>();
        sevs.add(new Sweater("T shirt COS", "White", 'M', 250));
        sevs.add(new Sweater("T shirt COS", "Grey", 'S', 250));
       
        //int menu = 0;
        //do{
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Skriv nummer 1 eller 2");
        int menu = scan.nextInt();
        
        
        switch (menu){
            case 1:
                showAll(bevs, sevs);
                break;
            case 2:
                showBev(bevs);
                break;
            default:
                System.out.println("Välj mellan 0-5");
                
        }
       //}while (menu != 0);
        
        //showAll(bevs, sevs);
        //showBev(bevs);
        
        
    }
    
   
    public static void showAll(ArrayList<Beverage> bevs, ArrayList<Sweater> sevs){
            
            for(Beverage i: bevs){
            //i.hotOrCold();
            //i.useItem();
            i.showItem();
            } 
        
            for(Sweater i: sevs){
            i.showItem();
            }
           
        }
    
    public static void showBev(ArrayList<Beverage> bevs){
            for(Beverage i: bevs){
                i.showItem();
            }
    }
        
    
    
}
