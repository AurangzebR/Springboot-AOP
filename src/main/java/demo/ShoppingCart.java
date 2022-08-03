package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String args){
        System.out.println("Checkout method from Shopping Cart called");
    }
    public int quantity(){
        return 2;
    }
}
