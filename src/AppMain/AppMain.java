package AppMain;

import factory.FurnitureFactory;
import factory.ModernFurnitureFactory;
import furniture.Chair;
import furniture.Sofa;
import builder.FurnitureBuilder;

public class AppMain {

	public static void main(String[] args) {
		// Usando Abstract Factory
        FurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair1 = factory.createChair();
        Sofa sofa1 = factory.createSofa();

        chair1.sitOn();
        sofa1.lieOn();

        System.out.println("---");

        // Usando Prototype (Clonando)
        Chair clonedChair = chair1.clone();
        clonedChair.sitOn();

        Sofa clonedSofa = sofa1.clone();
        clonedSofa.lieOn();

        System.out.println("---");

        // Usando Builder (Montando móveis personalizados)
        FurnitureBuilder builder = new FurnitureBuilder();
        Chair customChair = builder.setChairColor("Red").buildChair();
        Sofa customSofa = builder.setSofaMaterial("Velvet").buildSofa();

        customChair.sitOn();
        customSofa.lieOn();
	}

}
