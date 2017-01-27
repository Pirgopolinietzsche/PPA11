package assessment;

import java.util.TreeSet;

public class Banker extends Person {
	
	private TreeSet<Relative> relativesList;
	private Person hasChildren = new Person();
	
	public Banker(String name, int friendliness) {
		
		super(name, friendliness);
		relativesList = new TreeSet<Relative>();
		hasChildren=this;
		
	}
	
	public void moveTo(Person newGuardian){
		hasChildren=newGuardian;
	}
	
	public void closestRelative(){
		Relative closest = new Relative();
		for (Relative i : relativesList){
			if (i.getDistance()<closest.getDistance() || closest.getDistance()==-1){
				closest=i;
			}
		}
		moveTo(closest);
	}
	
	public boolean addRelative(String name, int friendliness, int distance){
		return relativesList.add(new Relative(name, friendliness, distance));
		
	}
	

	@Override
	public String toString() {
		return "Banker [relativesList=" + relativesList + "]";
	}
	
	
	

}
