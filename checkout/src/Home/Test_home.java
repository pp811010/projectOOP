
import Clothers.Shirt;
import Management.Cart;
import Management.FileController;
import Management.Stock;
import javax.swing.*;
import java.awt.*;

public class Test_home {

    private JFrame fr;
    private JPanel p1, ptt, pbn, film_pn, center_pn, left_film, right_film;
    private JButton bnAll, bnShirts, bnPants, bnYC;
    private JLabel title;
    private JScrollPane scrollPane;
    private Stock intostock;
    private Cart cart;
    private FileController fc;

    public Test_home() {
        
        intostock = new Stock();
        cart = new Cart();
        fc = new FileController(intostock);
        fr = new JFrame();
        p1 = new JPanel();
        ptt = new JPanel();
        pbn = new JPanel();
        film_pn = new JPanel();
        center_pn = new JPanel();
        left_film = new JPanel();
        right_film = new JPanel();

        bnAll = new JButton("   All   ");
        bnShirts = new JButton(" Shirts ");
        bnPants = new JButton(" Pants ");
        bnYC = new JButton("Your Cart");
        title = new JLabel("All Things");
        
        //font & background button
        title.setFont(new Font("MonoSpaced",Font.PLAIN,25));
        bnAll.setBackground(Color.white);
        bnShirts.setBackground(Color.white);
        bnPants.setBackground(Color.white);
        bnYC.setBackground(Color.white);
        
        p1.setLayout(new GridLayout(2, 1));
        ptt.add(title);
        ptt.setBackground(Color.decode("#C887E3"));
        pbn.add(bnAll);
        pbn.add(bnShirts);
        pbn.add(bnPants);
        pbn.add(bnYC);
        pbn.setBackground(Color.decode("#C887E3"));
        p1.add(ptt);
        p1.add(pbn);
  
        
        for(int i=0; i<intostock.getAll_stock().size(); i++){
            //String intostock_name, String intostock_detail, String intostock_color, int intostock_price, String intostock_path
            center_pn.add(new Test_Detail(cart, intostock.getAll_stock().get(i)));
        }



        film_pn.setLayout(new BorderLayout()); // Changed layout to BorderLayout

        center_pn.setLayout(new GridLayout(0, 3)); // Use GridLayout with 1 column

        scrollPane = new JScrollPane(center_pn);
        film_pn.add(scrollPane, BorderLayout.CENTER);
        left_film.setPreferredSize(new Dimension(30, 50));
        left_film.setBackground(Color.decode("#C5C6C1"));
        film_pn.add(left_film, BorderLayout.EAST);
        right_film.setPreferredSize(new Dimension(30, 50));
        right_film.setBackground(Color.decode("#C5C6C1"));
        film_pn.add(right_film, BorderLayout.WEST);
//        real_film.add(film_pn);

        fr.setLayout(new BorderLayout());
        fr.add(p1, BorderLayout.NORTH);
        fr.add(film_pn, BorderLayout.CENTER);

        // fr.add(p3, BorderLayout.SOUTH);
        fr.setSize(1000, 700);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);

    }

}
