/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back_end;

import Clothers.Shirt;
import Management.Stock;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Add implements ActionListener {

    private JFrame fr;
    private JPanel pn;
    private JButton add;
    //String name, String detail, String color, int price, String path
    private JTextField name, detail, color, price, path, types;
    private Stock stock;
    public Add(Stock stock) {
        this.stock = stock;
        fr = new JFrame();
        pn = new JPanel();
        add = new JButton("add");
        name = new JTextField();
        detail = new JTextField();
        color = new JTextField();
        price = new JTextField();
        path = new JTextField();
        types = new JTextField();

        pn.setLayout(new GridLayout(7, 1));
        pn.add(name);
        pn.add(detail);
        pn.add(color);
        pn.add(price);
        pn.add(path);
        pn.add(types);
        pn.add(add);

        add.addActionListener(this);

        fr.add(pn);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500, 600);
        fr.setVisible(true);
    }

    public static void main(String[] args) {
        new Add(new Stock());
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String p_Types = types.getText();
            String p_name = name.getText();
            String p_detail = detail.getText();
            String p_color = color.getText();
            int p_price = Integer.parseInt(price.getText());
            String p_path = path.getText();
            if (p_Types.equals("shirt")) {
                stock.getAll_stock().add(new Shirt(p_name, p_detail, p_color, p_price, p_path));
                System.out.println(stock.getAll_stock().get(stock.getAll_stock().size()-1).getName());
            } else {

            }
        }
    }
}
