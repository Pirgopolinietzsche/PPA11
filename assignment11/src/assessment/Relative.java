package assessment;

import java.util.Comparator;

public class Relative extends Person implements Comparable<Relative>{

	private int distance;

	public Relative(String name, int friendliness, int distance) {
		super(name, friendliness);
		this.distance=distance;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Relative [distance=" + distance + ", getName()=" + getName()
				+ ", getFriendliness()=" + getFriendliness() + "]";
	}
	

	@Override
	public int compareTo(Relative o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
}
