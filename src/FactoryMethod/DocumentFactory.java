package FactoryMethod;

public class DocumentFactory {
	public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } else if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }
        return null;
    }
}
