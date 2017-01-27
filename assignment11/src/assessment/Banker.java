package assessment;

import java.util.TreeSet;

public class Banker extends Person {
	
	private TreeSet<Relative> relativesList;

	public Banker(String name, int friendliness) {
		
		super(name, friendliness);
		relativesList = new TreeSet<Relative>();
		
	}
	
	public boolean addRelative(String name, int friendliness, int distance){
		return relativesList.add(new Relative(name, friendliness, distance));
		
	}
	

	@Override
	public String toString() {
		return "Banker [relativesList=" + relativesList + "]";
	}
	
	
	

}
