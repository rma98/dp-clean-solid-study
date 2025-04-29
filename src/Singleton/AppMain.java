package Singleton;

public class AppMain {

    public static void main(String[] args) {
        Printer printer = Printer.getInstance(); // CORRETO! 👍

        printer.print("Hello, Singleton Pattern!");
    }
}
