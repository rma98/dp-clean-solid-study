package FactoryMethod;

public class PdfDocument implements Document {

	@Override
	public void export() {
		System.out.println("Exporting as PDF...");
	}

}
