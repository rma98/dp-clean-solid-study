package factory;

import furniture.Chair;
import furniture.Sofa;
import furniture.modern.ModernChair;
import furniture.modern.ModernSofa;

public class ModernFurnitureFactory implements FurnitureFactory {

	@Override
	public Chair createChair() {
		return new ModernChair("Black");
	}

	@Override
	public Sofa createSofa() {
		return new ModernSofa("Leather");
	}
	
}
