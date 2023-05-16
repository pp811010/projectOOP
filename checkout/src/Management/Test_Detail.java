
import Clothers.Clothers;
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

public class Test_Detail extends JPanel implements ActionListener {

    private JPanel p1, p2, p3, p4, p5;
    private JLabel name, price, image;
    private JTextArea detail;
    private JButton bn;
    private Cart cart;
    //private BufferedImage bf;
    BufferedImage img1;
    private Clothers thing;
    private String de_name, de_color, de_path, de_type, de_detail;
    private int de_amount, de_price;

    public Test_Detail(Cart cart, Clothers thing) {
        this.thing = thing;
        de_name= thing.getName();
        de_detail= thing.getDetail();
        de_color = thing.getColor();
        de_price= thing.getPrice();
        de_path = thing.getPath();
        de_amount = thing.getAmount();
        de_type = thing.getType();
        this.cart = cart;
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        name = new JLabel(de_name + " (" + de_color + ")", SwingConstants.CENTER);
        price = new JLabel("Price : " + String.valueOf(de_price));
        detail = new JTextArea("Detail : " + de_detail);
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
            img1 = ImageIO.read(getClass().getResourceAsStream(de_path));
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
            System.out.println(de_name);
            cart.getCart().add(thing);
            cart.getCart().get(0).getName();
        }
    }
}

