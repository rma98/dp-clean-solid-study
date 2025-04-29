package Singleton;

public class Printer {
    private static Printer instance;

    private Printer() {} // Construtor privado

    public static Printer getInstance() {
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    public void print(String document) {
        System.out.println("Printing: " + document);
    }
}
