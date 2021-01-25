package OOPSConcept2;

public class BMW extends Car{ //has-a relationship
	//Method Overloading, When same some method is present class as in child class with same name and same number of arguments, 
	//is called Method Overloading
	
	public void start() {
		System.out.println("BMW ----- START");
	}
	
	public void theftSafety() {
		System.out.println("BMW------TheftSafety");
	}

	
}
