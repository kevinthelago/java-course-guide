| [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_4_advanced_java/lesson_5_advanced_algorithms) <img width=1000/> | [Home](https://github.com/Kevin-Lago/Java-Course-Guide) <img width=1000/> | [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_6_application_programming_interfaces/lesson_1_web_apps) <img width=1000> |
|:---|:---:|---:|

# Unit 5 Lesson 1 - Barcodes

---
## History

- Inspired by morse code, [Joseph Woodland](https://en.wikipedia.org/wiki/Norman_Joseph_Woodland) drew the first barcode using extended "dots" and "dashes" in the sand at the beach. He then used a [Photomultiplier Tube](https://en.wikipedia.org/wiki/Photomultiplier_tube) to read the barcodes off a sheet of paper. Later, He decided circles would be better than lines, allowing the barcode to be scanned in any direction.
- In 1951, Joseph moved to IBM and tried developing the idea. IBM commissioned a report on the idea, and concluded that processing the data would require equipment that was "some time off". Joseph [patented](https://patents.google.com/patent/US2612994A/en) his idea in 1952.
- In the 1960's IBM worked with various industries to define the standard [Universal Product Code](https://en.wikipedia.org/wiki/Universal_Product_Code). Later, in the 1970's barcodes revolutionized item transactions and management using the [IBM 3663](https://www.ibm.com/ibm/history/exhibits/vintage/vintage_4506VV4020.html).
- Since then many [types of barcodes](https://en.wikipedia.org/wiki/Barcode#Types_of_barcodes) were created.
- Now, barcodes can be categorized into two main types:
    - Linear Barcodes
    - Matrix (2D) Barcodes

---
## Linear Barcodes

---
## Universal Product Codes (UPCs)

---
## Code 39

- The Code 39 specification defines 43 characters.
- Characters are split into sections by patterns of "dots" and "dashes".
- Each barcode is prefixed and suffixed by an `*`.

---
## Java Barcode Libraries

- [Barbecue](barbecue/) — Generates a wide range of linear barcodes. See the [example project](barbecue/barbecue-examples/).
- [Barcode4J](barcode4j/) — Flexible barcode generator. See the [example project](barcode4j/barcode4j-examples/).
- [ZXing](zxing/) — Multi-format 1D/2D barcode library.
- [QRGen](qrgen/) — QR code generation built on top of ZXing.

---
## Sources

- [IBM](https://www.ibm.com/ibm/history/ibm100/us/en/icons/upc/)
- [Wikipedia](https://en.wikipedia.org/wiki/Barcode#Types_of_barcodes)

| <img width=1000/> [Previous Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_4_advanced_java/lesson_5_advanced_algorithms) | <img width=1000/> [Home](https://github.com/Kevin-Lago/Java-Course-Guide) | <img width=1000> [Next Lesson](https://github.com/Kevin-Lago/Java-Course-Guide/tree/master/unit_6_application_programming_interfaces/lesson_1_web_apps) |
|:---|:---:|---:|
