package models;

public class Product {
    public String name;
    int price;
    double rate;

    @Override
    public String toString() {
        return "\nНазвание товара: " + name +
                "\nЦена: " + price + " сом"+
                "\nОценка: " + rate
                ;
    }

    public Product() {
    }
    public Product(String name, int price, double rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;

    }
}
