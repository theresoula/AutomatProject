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
        System.out.println("Show me the money!");
    }
    

    @Override
    public void useItem() {
        System.out.println("Show me the money!");
    }
    
}
