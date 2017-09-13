
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class ShoppingBasket {
    
    private Map<String, Purchase> items;
    
    public ShoppingBasket(){
        this.items = new HashMap<String, Purchase>();
    }
    
    
    public void add(String product, int price){
        
        if(this.items.containsKey(product)){
            this.items.get(product).increaseAmount();
        }else{
            Purchase purchase = new Purchase(product, 1, price);
            this.items.put(product, purchase);
        }
        
        
    }
    
    
    public int price(){
        
        int price = 0;
        
        for(Purchase purchase : this.items.values()){
            price+=purchase.price();
        }
        
        return price;
    }
    
    
    public void print(){
    
        for(Purchase purchase : this.items.values()){
            System.out.println(purchase.toString());
        }     
    }
}
