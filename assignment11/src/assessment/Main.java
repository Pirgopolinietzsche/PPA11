package assessment;

public class Main {
	public static void main(String args[]) {
		
		Banker mrPoe = new Banker("Mr. Poe", 5);
		mrPoe.addRelative("Olaf", -10, 10);
		mrPoe.addRelative("Josephine", 5, 100);
		mrPoe.addRelative("Sir", 20, 0);
		mrPoe.addRelative("Uncle Monty", 20, 10);
		
		System.out.println(mrPoe);
		
		
	}
}
