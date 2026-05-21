package org.example.codabar;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.linear.codabar.CodabarBarcode;
import org.example.util.Display;

public class CodabarBarcodes {
    public static void main(String[] args) {
        generateCodabarBarcode("12345678901234");
    }

    public static void generateCodabarBarcode(String value) {
        try {
            Barcode barcode = new CodabarBarcode(value);
            Display.displayBarcode(barcode);
        } catch (BarcodeException e) {
            System.out.println(e.getMessage());
        }
    }
}
