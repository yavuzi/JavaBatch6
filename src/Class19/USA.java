package Class19;

public class USA {
	String state, stateCapital;
	
	public USA(String state, String stateCapital) {
	this.state=state;
	this.stateCapital=stateCapital;
	}
	public void displayState() {
	System.out.println(state);	
	}
	public void displayStateCapital() {
	System.out.println(stateCapital);	
	}
	// having methods inside a method
	public void displayInfo() {
		displayState();
		displayStateCapital();
		
	}

	public static void main(String[] args) {
		USA state1=new USA("Texas", "Austin");
		state1.displayInfo();
		
		state1=new USA("Georgia","Atlanta");
		state1.displayInfo();
	}
	
	
}
