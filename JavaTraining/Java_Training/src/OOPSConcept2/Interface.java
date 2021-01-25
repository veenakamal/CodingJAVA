package OOPSConcept2;

public interface Interface {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfermoney();
	
	//only method declaration
	//no method body - only method prototype
	//in interface, we can declare the variable, vars are by default static in nature
	//vars value will not change
	//no static method in interface
	//We cant create object in interface
	//Interface is abstract in nature

}
