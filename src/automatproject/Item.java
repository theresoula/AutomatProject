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
abstract public class Item {
  
    public String name;
    public String color;
    public char itemSize;
    public int cost;
    
    //Constructor
    public Item(String name, String color, char itemSize, int cost){
        this.name = name;
        this.color = color;
        this.itemSize = itemSize;
        this.cost = cost;
    }
    
    
    
    
    
}
