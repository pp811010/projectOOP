package CheckoutPage;


import Management.Cart;
import java.awt.*;
import javax.swing.*;

public class Right extends JPanel{
    //private JFrame frame;
    private JPanel center_pn,txt_pn, sum_pn, bt_pn;
    private JLabel pay, txt_pay, total;
    private JButton bt_confirm;
    private int pay_total = 0;
    
    public Right(Cart cart){
        for(int i=0; i<cart.getCart().size(); i++){
            pay_total += cart.getCart().get(i).getPrice();
        }
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.decode("#001E42"));
        //frame = new JFrame("Right")
        pay = new JLabel("Payment", SwingConstants.CENTER);
        pay.setFont(new Font("Arial", Font.BOLD, 30));
        center_pn = new JPanel();
        sum_pn = new JPanel();
        txt_pay = new JLabel("TOTAL PRICE", SwingConstants.CENTER);
        txt_pay.setFont(new Font("Serif", Font.BOLD, 10));
        total = new JLabel(String.valueOf(pay_total), SwingConstants.CENTER);
        total.setFont(new Font("Serif", Font.BOLD, 18));
        bt_pn = new JPanel();
        bt_confirm = new JButton("Order confirmation");
        bt_confirm.setForeground(Color.white);
        bt_confirm.setBackground(Color.decode("#2D5D69"));
        //bt_confirm.setPreferredSize(new Dimension(180, 40));
        
        bt_pn.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        //btn.setPreferredSize(new Dimension(40, 40));
        bt_pn.add(bt_confirm);
        bt_pn.setBackground(Color.decode("#4C4F1D"));
        
        center_pn.setLayout(new BorderLayout());
        center_pn.setBackground(Color.decode("#FA8D12"));
        center_pn.setPreferredSize(new Dimension(270, 150));
        
        sum_pn.setLayout(new GridLayout(1,2));
        sum_pn.add(txt_pay);
        sum_pn.add(total);
        //sum_pn.add(sum);
        
        center_pn.add(pay, BorderLayout.NORTH);
        center_pn.add(sum_pn, BorderLayout.CENTER);
        center_pn.add(bt_pn, BorderLayout.SOUTH);
        this.add(center_pn);
        //frame.add(this);
        
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(1000,700);
        //frame.setVisible(true);
    }

    public int getPay_total() {
        return pay_total;
    }

    public void setPay_total(int pay_total) {
        this.pay_total = pay_total;
    }

}
