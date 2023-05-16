package Management;

import Clothers.*;
import Clothers.Shirt;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.*;

public class Stock {

    private ArrayList<Clothers> all_stock;
    private ArrayList<Clothers> shirt_stock;
    private ArrayList<Clothers> pant_stock;

    public Stock() {
        all_stock = new ArrayList<Clothers>();
        loadStock();

    }

    public void loadStock() {
        shirt_stock = new ArrayList<>();
        shirt_stock.add(new Shirt("T-shirt", "\nA T-shirt with a soft, comfortable feel. \nThe design is simple.", "Black", 250, "/shirt_image/black.png", 10));
        shirt_stock.add(new Shirt("Tiger T-shirt", "\nInspired by the Tiger \nThere is a pattern around the shirt.", "Dark blue", 400, "/shirt_image/tiger.png", 20));
        shirt_stock.add(new Shirt("Tim guitar T-shirt", "\nIt is a design of artist tim ,\nwhich is a world famous design.", "Colorful", 670, "/shirt_image/colorful.png", 30));
        all_stock.addAll(shirt_stock);
    }

    public ArrayList<Clothers> getAll_stock() {
        return all_stock;
    }

    public void setAll_stock(ArrayList<Clothers> all_stock) {
        this.all_stock = all_stock;
    }

    public static void main(String[] args) {
        new Stock();
    }

    public ArrayList<Clothers> getShirt_stock() {
        return shirt_stock;
    }

    public void setShirt_stock(ArrayList<Clothers> shirt_stock) {
        this.shirt_stock = shirt_stock;
    }

    public ArrayList<Clothers> getPant_stock() {
        return pant_stock;
    }

    public void setPant_stock(ArrayList<Clothers> pant_stock) {
        this.pant_stock = pant_stock;
    }

}
