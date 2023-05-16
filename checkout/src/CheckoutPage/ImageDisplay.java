package CheckoutPage;

import Management.Stock;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;

public class ImageDisplay extends JFrame {
    private Stock stock;
    
    public ImageDisplay() {
        super("Image Display");
        stock = new Stock();
        String imagePath = stock.getAll_stock().get(0).getPath();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        JLabel imageLabel = new JLabel();

        // Load the image from the file path
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage();

        Image scaledImage = image.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        ImageIcon scaledImageIcon = new ImageIcon(scaledImage);

        // Set the scaled image icon to the label
        imageLabel.setIcon(scaledImageIcon);
        
        panel.add(imageLabel);
        getContentPane().add(panel);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        ImageDisplay imageDisplay = new ImageDisplay();
                imageDisplay.setVisible(true);
    }
}
