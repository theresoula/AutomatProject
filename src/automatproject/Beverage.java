/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatproject;

/**
 *
 * @author theresoula
 */
public class Beverage extends Item {
    
    //eget attribut
    public boolean tempBev; 
    
    public Beverage(String name, String color, char itemSize, int cost, boolean tempBev){
        super(name, color, itemSize, cost);
        this.tempBev = tempBev;
    }
    
    public void hotOrCold(){
        //om boolean temperatur på bevarge är lika med true
        if(tempBev){
            System.out.println(name + "Be Careful! Beverage is HOT!");       
        }else{ //false
            System.out.println(name + "Beverage is ice cold!");
        }
    }
    
}
