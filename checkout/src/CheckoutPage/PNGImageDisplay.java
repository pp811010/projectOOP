package CheckoutPage;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PNGImageDisplay extends JFrame {

    private JLabel imageLabel; 

    public PNGImageDisplay() {
        super("PNG Image Display");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        imageLabel = new JLabel();
        getContentPane().add(imageLabel);

        pack();
        setLocationRelativeTo(null);
    }

    public void displayImage(String imagePath) {
        // Check if the file path has the correct extension
        if (!imagePath.toLowerCase().endsWith(".png")) {
            System.out.println("Invalid file extension. Please provide a PNG image file.");
            return;
        }

        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(500, 600, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        imageLabel.setIcon(imageIcon);
        imageLabel.setSize(100, 200);
        pack();
    }

    public static void main(String[] args) {

        PNGImageDisplay imageDisplay = new PNGImageDisplay();
        imageDisplay.setVisible(true);

        // Example usage:
        String imagePath = "C:\\Users\\Ploy\\OneDrive\\เดสก์ท็อป\\shirt\\1668399357dbf51b90b9196cb246689b0e3d855bbf_thumbnail_900x.png";
        imageDisplay.displayImage(imagePath);
    }
}
