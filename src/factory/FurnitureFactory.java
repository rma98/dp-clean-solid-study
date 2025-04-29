package factory;

import furniture.Chair;
import furniture.Sofa;

public interface FurnitureFactory {
	Chair createChair();
    Sofa createSofa();
}
