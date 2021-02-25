/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatproject;

import java.util.ArrayList;

/**
 *
 * @author theresoula
 */
public class AutomatProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ArrayList för nya Items 
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Sweater("COS Tshirt", "White", 'M', 250));
        items.add(new Sweater("COS Tshirt", "Grey", 'S', 250));

        // size G, T, V (grande, tall, venti Starbucks storlekar
        items.add(new Beverage("Cafe latte", "Color", 'G', 35, true));
        items.add(new Beverage("Nitro Cold Brew", "Color", 'T', 45, false));
        
        
        
        for(Item i: items){
            System.out.println(i.name +  " " + i.cost + " SEK");
        }
        
       
        
    }
    
     /*public static void showMe(ArrayList<Item> items){
            for(Item i: items){
                i.hotOrCold();
            }
        }*/
    
}
