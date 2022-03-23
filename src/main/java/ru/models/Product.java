package ru.models;

public class Product extends Model{
    private double price;
    private int count;
    public Product(Integer id, double price, int count) {
        super(id);
        this.price = price;
        this.count = count;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    @Override
    public String toString() {
        return super.toString() + "; price: " + price + "; count: "+ count;
    }
}
