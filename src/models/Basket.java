package models;

import java.util.Arrays;

public class Basket {
    Product[] bought;
    @Override
    public String toString(){
        return "\nВаша корзина товаров: ";
    }

    public Basket(Product[]bought){
        this.bought=bought;

    }
    public void addProduct(Product product) {
        Product[] newBought = Arrays.copyOf(bought, bought.length + 1);
        newBought[bought.length] = product;
        bought = newBought;
    }
    public void printBasket(){
        double sum = 0;
        System.out.print("Ваша корзина товаров: ");
        for (Product p : bought){

            System.out.print(p.name + " ");
        }
        for (Product price : bought){
            sum += price.price ;

        }
        System.out.println("\nНа сумму: "+sum+" сом.");
    }


}


