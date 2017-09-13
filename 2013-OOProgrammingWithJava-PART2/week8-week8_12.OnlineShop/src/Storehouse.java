
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Xorfos
 */
public class Storehouse {
    
    private Map<String, Integer> productPrices = new HashMap<String, Integer>();
    private Map<String, Integer> productStocks = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock){
        
        this.productPrices.put(product, price);
        this.productStocks.put(product, stock);
    }
    
    public int price(String product){
        
        if(this.productPrices.containsKey(product)){
            return this.productPrices.get(product);
        }
        
        return -99;
    }
    
    public int stock(String product){
        
        if(this.productStocks.containsKey(product)){
            return this.productStocks.get(product);
        }
        
        return 0;
    }
    
    public boolean take(String product){
        
        if(this.productStocks.containsKey(product)){
            if(this.productStocks.get(product) > 0){
              this.productStocks.put(product, this.productStocks.get(product)-1);
              return true;
            }
            
        }
        return false;
    }
    
    public Set<String> products(){
        
        Set<String> products = new HashSet<String>();
        
        for(String product : this.productPrices.keySet()){          
            products.add(product);
        }
        
        return products;
    }
    
    
}
