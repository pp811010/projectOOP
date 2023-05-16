package Clothers;


import Clothers.Clothers;

public class Shirt extends Clothers{
    private String name;
    private int price;
    private String path;
    private String type = "shirt";
    private int amount ;
    
    public Shirt(String name, String detail, String color, int price, String path, int amount){
        super(detail, color);
        this.name = name;
        this.price = price;
        this.path = path;
    }
    
    @Override
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
