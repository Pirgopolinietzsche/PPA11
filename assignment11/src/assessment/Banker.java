package assessment;

import java.util.TreeSet;

public class Banker extends Person {
	
	private TreeSet<Relative> relativesList;

	public Banker(String name, int friendliness) {
		
		super(name, friendliness);
		relativesList = new TreeSet<Relative>();
		
	}
	
	public void addRelative(Relative relative){
		relativesList.add(relative);
		
	}
	

	@Override
	public String toString() {
		return "Banker [relativesList=" + relativesList + "]";
	}
	
	
	

}
