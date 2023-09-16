package com.driver;

import java.net.StandardSocketOptions;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese;
    private boolean extraToppings;
    private int extraToppingsCost;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg == true){
           System.out.println("Base Price Of The Pizza: " + (price += 300));
            this.extraToppingsCost = 70;
        }else{
            System.out.println("Base Price Of The Pizza: " + (price += 400));
            this.extraToppingsCost = 120;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       if(extraCheese == false){
           System.out.println("Extra Cheese Added: " + 80);
           price += 80;
           extraCheese = true;
       }
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraToppings == false){
            System.out.println("Extra Toppings Added: " + extraToppingsCost);
            price += extraToppingsCost;
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        System.out.println("Paperbag Added: " + 20);
        price += 20;
    }

    public String getBill(){
        // your code goes here
        this.bill = String.valueOf(price);
        System.out.print("Total Price: ");
        return this.bill;
    }
}
