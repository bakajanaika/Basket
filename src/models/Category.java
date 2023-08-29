package models;

public class Category {
    String category;
    public Product[] name;
    @Override
    public String toString(){
        return "\nКатегория товаров: " + category;
    }

    public Category (){
    }
    public Category (String category, Product[] name){
        this.category=category;
        this.name=name;
    }
}