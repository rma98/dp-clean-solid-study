package furniture.modern;

import furniture.Sofa;

public class ModernSofa implements Sofa {
	private String material;
	
	public ModernSofa(String material) {
        this.material = material;
    }

	@Override
	public void lieOn() {
		System.out.println("Lying on a modern sofa made of " + material);
	}
	
	public Sofa clone() {
        return new ModernSofa(this.material);
    }
	
}
