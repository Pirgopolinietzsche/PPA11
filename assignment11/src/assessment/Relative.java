package assessment;

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
		if (o == null) {
            throw new NullPointerException("Null parameter");
        }
		if (this.getName().compareTo(o.getName())==-1){
			return 1;
		}

		else if (o.equals(this)){
			return 0;
		} 
		else return -1;
	}
	
	

	
	
	
	
	
	
}
