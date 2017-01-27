package assessment;

public class Main {
	public static void main(String args[]) {
		Banker mrPoe = new Banker("Mr. Poe", 5);
		mrPoe.addRelative(new Relative("Olaf", -10, 10));
		mrPoe.addRelative(new Relative("Josephine", 5, 100));
		System.out.println(mrPoe);
		
		
	}
}
