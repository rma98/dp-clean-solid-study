package FactoryMethod;

public class WordDocument implements Document {

	@Override
	public void export() {
		System.out.println("Exporting as Word...");
	}

}
