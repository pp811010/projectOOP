
import Clothers.Pants;
import Clothers.Shirt;
import Management.Cart;
import Management.Stock;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.*;

public class Detail_Product extends JPanel implements ActionListener {

    private JPanel p1, p2, p3, p4, p5;
    private JLabel name, price, image;
    private JTextArea detail;
    private JButton bn;
    private Cart cart;
    //private BufferedImage bf;
    BufferedImage img1;
    String thing_name, thing_detail, thing_color, thing_path, thing_type;
    int thing_price;

    public Detail_Product(Cart cart, String intostock_name, String intostock_detail, String intostock_color, int intostock_price, String intostock_path, String intostock_type) {
        thing_name = intostock_name;
        thing_detail = intostock_detail;
        thing_color = intostock_color;
        thing_price = intostock_price;
        thing_path = intostock_path;
        thing_type = intostock_type;
        this.cart = cart;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        name = new JLabel(intostock_name + " (" + intostock_color + ")", SwingConstants.CENTER);
        price = new JLabel("Price : " + String.valueOf(intostock_price));
        detail = new JTextArea("Detail : " + intostock_detail);
        bn = new JButton("Buy");

        detail.setBackground(Color.decode("#B9FC7F"));
        detail.setEditable(false);
        p1.setLayout(new BorderLayout());
        p1.add(name, BorderLayout.NORTH);
        p1.add(detail, BorderLayout.CENTER);

        p2.setLayout(new GridLayout(2, 1));
        p4.add(price);
        p5.add(bn);
        p2.add(p4);
        p2.add(p5);
        this.setLayout(new BorderLayout());
        this.add(p1, BorderLayout.CENTER);
        this.add(p2, BorderLayout.SOUTH);
        this.add(p3, BorderLayout.NORTH);

        bn.addActionListener(this);

//        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(getClass().getResourceAsStream(intostock_path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        image = new JLabel(new ImageIcon(img1));
        p3.add(image);

        this.setPreferredSize(new Dimension(270, 450));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bn) {
            System.out.println(thing_type);
            if("shirt".equals(thing_type)){
                System.out.println("dfsf");
                cart.getCart().add(new Shirt(thing_name, thing_detail, thing_color, thing_price, thing_path));
            }else{
                cart.getCart().add(new Pants(thing_name, thing_detail, thing_color, thing_price, thing_path));
                //System.out.println(cart.getCart().get(0).getName());
            }
        }
    }
}

