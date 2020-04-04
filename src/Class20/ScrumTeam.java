package Class20;

public class ScrumTeam extends Employee {
	String ceremonies;
	
	void attendMeetings() {
		System.out.println("Scrum Team attends "+ ceremonies);
	}

	@Override
	void getPaid() {
		// TODO Auto-generated method stub
		super.getPaid();
	}

}
