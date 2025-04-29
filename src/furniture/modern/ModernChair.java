package furniture.modern;

import furniture.Chair;

public class ModernChair implements Chair {
	private String color;

	public ModernChair(String color) {
		this.color = color;
	}

	@Override
	public void sitOn() {
		System.out.println("Sitting on a modern chair. Color: " + color);
	}

	public Chair clone() {
		return new ModernChair(this.color);
	}

}
