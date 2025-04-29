package AbstractFactory;

public class AppMain {

	public static void main(String[] args) {
		FurnitureFactory factory = new ModernFurnitureFactory();
		FurnitureFactory factory2 = new VictorianFurnitureFactory();

        Sofa sofa = factory.createSofa();
        Chair chair = factory.createChair();

        sofa.sitOn();
        chair.sitOn();
        
        System.out.println();
        
        Sofa sofa2 = factory2.createSofa();
        Chair chair2 = factory2.createChair();
        
        sofa2.sitOn();
        chair2.sitOn();
	}

}
