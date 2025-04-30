package clean.code;

public class MultiplicationPrinter {
	public void printMultiplicationSequence() {
        int counter = 0;
        while (counter < 10) {
            System.out.println(counter * 3 + 2);
            counter++;
        }
    }
}
