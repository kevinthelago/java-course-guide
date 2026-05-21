package org.example.code39;

import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.linear.code39.Code39Barcode;
import net.sourceforge.barbecue.output.Output;
import net.sourceforge.barbecue.output.OutputException;
import org.example.util.Display;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Code39Barcodes {
    public static void main(String[] args) {
        generateCode39Barcode("1", false, false);
//        generateCode39Barcode("123456789", true, false);
//        generateCode39Barcode("123456789", false, false);
    }

    public static void generateCode39Barcode(String value, boolean encodeExtendedChars, boolean requiresChecksum) {
        try {
            Barcode barcode = new Code39Barcode(value, encodeExtendedChars, requiresChecksum);
            BufferedImage bufferedImage = BarcodeImageHandler.getImage(barcode);
            ImageIO.write(bufferedImage, "SVG", new File("./barcode.svg"));
            Display.displayBarcode(barcode);
        } catch (BarcodeException | OutputException | IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
