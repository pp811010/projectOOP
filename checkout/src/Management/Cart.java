package Management;

import Clothers.Clothers;
import Clothers.Shirt;
import java.util.*;

public class Cart {

    private ArrayList<Clothers> cart;

    public Cart() {
        cart = new ArrayList<Clothers>();
        cart.add(new Shirt("T-shirt", "\nA T-shirt with a soft, comfortable feel. \nThe design is simple.", "Black", 250, "/shirt_image/black.png", 10));
            cart.add(new Shirt("T-shirt", "\nA T-shirt with a soft, comfortable feel. \nThe design is simple.", "Black", 250, "/shirt_image/black.png", 10));
        cart.add(new Shirt("T-shirt", "\nA T-shirt with a soft, comfortable feel. \nThe design is simple.", "Black", 2880, "/shirt_image/black.png", 10));
        cart.add(new Shirt("T-shirt", "\nA T-shirt with a soft, comfortable feel. \nThe design is simple.", "Black", 2200, "/shirt_image/black.png", 10));

    }
    

    public ArrayList<Clothers> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Clothers> cart) {
        this.cart = cart;
    }

}
