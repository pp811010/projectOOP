package CheckoutPage;

import Management.Cart;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Left extends JPanel {

    private JFrame fr;
    private JPanel center_pn, order_pn, sc_pn, side1_sc, side2_sc, side3_sc;
    private JLabel yourorder;
    private BufferedImage img;
    private JScrollPane scrollPane;
    private Cart cart;
    private Checkout co;

    public Left(Checkout co, Cart cart) {
        this.cart = cart;
        this.co = co;
        this.setLayout(new BorderLayout());
        center_pn = new JPanel();
        yourorder = new JLabel("Your Order", SwingConstants.CENTER);
        yourorder.setFont(new Font("Arial", Font.BOLD, 45));
        yourorder.setForeground(new Color(136, 169, 195));
        order_pn = new JPanel();
        sc_pn = new JPanel();
        side1_sc = new JPanel();
        side2_sc = new JPanel();
        side3_sc = new JPanel();

        center_pn.setLayout(new BorderLayout());
        order_pn.setLayout(new BoxLayout(order_pn, BoxLayout.Y_AXIS));
        sc_pn.setLayout(new BorderLayout());
        
        
        side1_sc.setPreferredSize(new Dimension(10, 50));
        side2_sc.setPreferredSize(new Dimension(10, 50));
        side3_sc.setPreferredSize(new Dimension(10, 30));
        side1_sc.setBackground(Color.decode("#14202E"));
        side2_sc.setBackground(Color.decode("#14202E"));
        side3_sc.setBackground(Color.decode("#14202E"));
        
        add_display();
        scrollPane = new JScrollPane(order_pn);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sc_pn.add(side1_sc , BorderLayout.WEST);
        sc_pn.add(scrollPane, BorderLayout.CENTER);
        sc_pn.add(side2_sc , BorderLayout.EAST);
        sc_pn.add(side3_sc , BorderLayout.SOUTH);
        
        center_pn.setBackground(Color.decode("#14202E"));
        center_pn.add(yourorder, BorderLayout.NORTH);
        center_pn.add(sc_pn, BorderLayout.CENTER);
        this.add(center_pn);
                
        try {
            img = ImageIO.read(getClass().getResourceAsStream("/Shirt_image/tiger.png"));
        } catch (IOException ex) {
            System.out.println("Image not FOUND");
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(img, 0, 0, 250 * 4, 300 * 3, null);
    }


    public void add_display() {
        for (int i = 0; i < cart.getCart().size(); i++) {
            //String intostock_name, String intostock_detail, String intostock_color, int intostock_price, String intostock_path
            System.out.println("new");
            cart.getCart().get(i).getName();
            order_pn.add(new Each_order(this, cart, cart.getCart().get(i), i));
        }
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getCenter_pn() {
        return center_pn;
    }

    public void setCenter_pn(JPanel center_pn) {
        this.center_pn = center_pn;
    }

    public JPanel getOrder_pn() {
        return order_pn;
    }

    public void setOrder_pn(JPanel order_pn) {
        this.order_pn = order_pn;
    }

    public JLabel getYourorder() {
        return yourorder;
    }

    public void setYourorder(JLabel yourorder) {
        this.yourorder = yourorder;
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
    }

    public JScrollPane getScrollPane() {
        return scrollPane;
    }

    public void setScrollPane(JScrollPane scrollPane) {
        this.scrollPane = scrollPane;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Checkout getCo() {
        return co;
    }

    public void setCo(Checkout co) {
        this.co = co;
    }

    public void refreshPage() {

        this.revalidate();
        this .repaint();
        co.getFr().invalidate();
        co.getFr().validate();
        co.getFr().repaint();
    }

}
