package OOPSConcept2;

public class HSBCBank implements Interface,BrazilBank {//We are achieving multiple inheritance
	//is-a relationship -> Interface and class
	//has a relationship -> Class and class
	
	//If class is implementing any Interface, then its mandatory is define/override all the method of interface
	
	public void credit() {
		System.out.println("HSBC CREDIT");
	}
	
	public void debit() {
		System.out.println("HSBC DEBIT");
	}
	
	public void transfermoney() {
		System.out.println("TRANSFERMONEY");
	}
	
	public void educationloan() {
		System.out.println("Education Loan");
	}
	
	public void carloan() {
		System.out.println("CAR Loan");
	}
	
	public void mutualFund() {
		System.out.println("Mutual Fund");
	}
	

}
