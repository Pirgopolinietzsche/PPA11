package assessment;

public class Main {
	public static void main(String args[]) {
		Banker mrPoe = new Banker("Mr. Poe", 5);
		mrPoe.addRelative("Olaf", -10, 10);
		mrPoe.addRelative("Josephine", 5, 100);
		mrPoe.addRelative("Ajeje", 50, 89);
		
		System.out.println(mrPoe);
		
		
	}
}
