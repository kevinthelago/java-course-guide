package org.example.util;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Display {
    public static void displayBarcode(Barcode barcode) {
        try {
            BufferedImage barcodeImage = BarcodeImageHandler.getImage(barcode);
            JFrame jFrame = new JFrame();
            jFrame.getContentPane().setLayout(new FlowLayout());
            jFrame.getContentPane().add(new JLabel(new ImageIcon(barcodeImage)));
            jFrame.pack();
            jFrame.setVisible(true);
        } catch (OutputException e) {
            System.out.println(e.getMessage());
        }
    }
}
