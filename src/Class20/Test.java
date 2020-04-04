package Class20;

public class Test {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		Employee.company="ABC";
		emp.empNumber=101;
		emp.salary=90000;
				
		emp.getPaid();
		emp.work();
		
		ScrumTeam sc=new ScrumTeam();
		sc.ceremonies="Retrospective Ceremonies";
		sc.attendMeetings();
		
		ProductOwner po=new ProductOwner();
		po.empNumber=123;
		po.salary=150000;
		po.ceremonies="Sprint Grooming, Sprint Plannning, Sprint Demo, Daily Stand up";
		po.attendMeetings();
		po.prioritizeBacklog();
		
		ScrumMaster scm=new ScrumMaster();
		scm.navigateTeam();
		
		Developer dev=new Developer();
		dev.coding();
		
		Tester tes=new Tester();
		tes.test();
		
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.workWithRequirements();
		
		
		
		
		

	}

}
