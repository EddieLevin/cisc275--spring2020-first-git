public class Animal{
	int numLegs;
	String name;
	public int getLegs(){
		return numLegs;
	}
	public String toString(){
		return name + " " + Integer.toString(numLegs);
	}
}
