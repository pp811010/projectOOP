package CheckoutPage;

import Management.Cart;
import Management.FileController;
import java.awt.*;
import javax.swing.*;

public class Checkout {

    private JFrame fr;
    private JPanel film;
    private Left left_pn;
    private Right right_pn;
    private Cart cart;

    public Checkout() {
        cart = new Cart();
        fr = new JFrame("Checkout");
        film = new JPanel();
        left_pn = new Left(this, cart);
        right_pn = new Right(cart);
        //fc = new FileController(stock);
        
        film.setLayout(new GridBagLayout());
        left_pn.setBackground(Color.red);
        

        GridBagConstraints position = new GridBagConstraints();

        // Button 1 takes up 60% of the width
        position.gridx = 0;
        position.gridy = 0;
        //position.weightx = 1.0; // Take up the entire width
        position.weighty = 1.0; 
        position.fill = GridBagConstraints.BOTH;
        position.weightx = 0.8;
        film.add(left_pn, position);

        position.gridx = 1;
        position.weightx = 0.2;
        film.add(right_pn, position);

        fr.add(film);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000, 700);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Checkout();
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getFilm() {
        return film;
    }

    public void setFilm(JPanel film) {
        this.film = film;
    }

    public Left getLeft_pn() {
        return left_pn;
    }

    public void setLeft_pn(Left left_pn) {
        this.left_pn = left_pn;
    }

    public Right getRight_pn() {
        return right_pn;
    }

    public void setRight_pn(Right right_pn) {
        this.right_pn = right_pn;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
