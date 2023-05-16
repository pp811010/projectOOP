package CheckoutPage;

import Clothers.Clothers;
import Management.Cart;
import Management.Stock;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Each_order extends JPanel implements ActionListener{
    //private JFrame fr;
    private JPanel p1, p2, p3;
    private JLabel name, color_size, price, number, image;
    private JButton boxdelete, boxadd, delete;
    private Cart cart;
    private Clothers orders;
    private int index;
    private Left panel;

    public Each_order(Left panel, Cart cart, Clothers order, int i){
        index = i;
        this.cart = cart;
        this.panel = panel;
        this.orders = order;
        this.setLayout(new GridLayout(1,2));
        this.setBackground(Color.decode("#DAF4F7"));
        //fr = new JFrame();
        p1 = new JPanel();
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,1));
        p3 = new JPanel();
        //p4 = new JPanel();
        name = new JLabel(order.getName(), SwingConstants.CENTER);
        color_size = new JLabel(order.getColor());
        price = new JLabel("฿" + String.valueOf(order.getPrice()));
        boxdelete = new JButton("-");
        number = new JLabel("1");
        //boxadd = new JButton("+");
        //pricesum = new JLabel("฿390");
        delete = new JButton("Delete");
        
        delete.addActionListener(this);
        
        delete.setBackground(Color.decode("#CD5050"));
        delete.setForeground(Color.white);
        
        BufferedImage img = null;

        try{
            img = ImageIO.read(getClass().getResourceAsStream(order.getPath()));
        } catch(IOException ex){
             System.out.println("Image not FOUND");
        }
        
        image = new JLabel(new ImageIcon(img));

        p3.add(color_size);
        p3.add(price);
        p3.add(number);
        p3.add(delete);
        p3.setBackground(Color.decode("#DAD7D8"));

        p1.add(image);
        p2.add(name);
        p2.add(p3);

        this.add(p1);
        this.add(p2);
        
        this.setPreferredSize(new Dimension(300,320));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == delete){
            System.out.println("sdffs");
            cart.getCart().remove(index);
            panel.getOrder_pn().removeAll();
            panel.add_display();
            panel.refreshPage();
            //cart.getCart().remove(index);
        }
    }
    
}

