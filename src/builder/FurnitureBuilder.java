package builder;

import furniture.modern.ModernChair;
import furniture.modern.ModernSofa;

public class FurnitureBuilder {
	private String chairColor;
    private String sofaMaterial;
    
    public FurnitureBuilder setChairColor(String color) {
        this.chairColor = color;
        return this;
    }

    public FurnitureBuilder setSofaMaterial(String material) {
        this.sofaMaterial = material;
        return this;
    }

    public ModernChair buildChair() {
        return new ModernChair(chairColor);
    }

    public ModernSofa buildSofa() {
        return new ModernSofa(sofaMaterial);
    }
}
