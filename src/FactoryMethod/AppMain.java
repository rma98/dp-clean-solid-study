package FactoryMethod;

public class AppMain {

    public static void main(String[] args) {
        Document pdf = DocumentFactory.createDocument("pdf");
        pdf.export(); // Deve imprimir: Exporting as PDF...

        Document word = DocumentFactory.createDocument("word");
        word.export(); // Deve imprimir: Exporting as Word...
    }
}
