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
public class Beverage extends Item implements MethodsItem{
    
    //eget attribut
    public boolean tempBev; 
    
    public Beverage(String name, String color, char itemSize, int cost, boolean tempBev){
        super(name, color, itemSize, cost);
        this.tempBev = tempBev;
    }
    
    public void hotOrCold(){
        //om boolean temperatur på beverage är lika med true
        if(tempBev){
            System.out.println(" Be Careful! Beverage is HOT!");       
        }else{ //false
            System.out.println(" Beverage is ice cold!");
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
        System.out.println("" + tempBev);
    }

    @Override
    public void useItem() {
        System.out.println("Enjoy your drink!");
    }
    
}
