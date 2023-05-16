/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Management;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class FileController {
    private Stock stock;
    public FileController(Stock stock){
        this.stock = stock;
    }
    
    public void shirt_writefile(){
        //FileOutputStream file = new FileOutputStream("shirt_file.txr");
        try {
            FileOutputStream fl = new FileOutputStream("shirt_file.dat");
            ObjectOutputStream shirt_file = new ObjectOutputStream(fl);
            shirt_file.writeObject(stock.getShirt_stock());
            //wo.flush();
            //}
            shirt_file.close();
            fl.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
