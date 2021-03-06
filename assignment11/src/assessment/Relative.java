package assessment;

public class Relative extends Person implements Comparable<Relative>{

	private int distance;

	public Relative(String name, int friendliness, int distance) {
		super(name, friendliness);
		this.distance=distance;
	}
	
	public Relative(){
		this.distance=-1;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return getName();
	}
	

	@Override
	public int compareTo(Relative o) {
		if (o == null) {
            throw new NullPointerException("Null parameter");
        }
		return this.getName().compareTo(o.getName());
	}
	
	

	
	
	
	
	
	
}
