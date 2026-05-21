package org.example.bookland;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.linear.ean.BooklandBarcode;
import org.example.util.Display;

public class BooklandBarcodes {
    public static void main(String[] args) {
        generateBooklandBarcode("1234567890");
    }

    public static void generateBooklandBarcode(String value) {
        try {
            Barcode barcode = new BooklandBarcode(value);
            Display.displayBarcode(barcode);
        } catch (BarcodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
