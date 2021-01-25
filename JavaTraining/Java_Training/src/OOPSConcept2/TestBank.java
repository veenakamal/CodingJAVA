package OOPSConcept2;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank obj = new HSBCBank();	
		//Overiding from  Interface
		obj.credit();
		obj.debit();
		obj.transfermoney();
		//Seperate Functions
		obj.educationloan();
		obj.carloan();
		//Overiding from BrazilBank
		obj.mutualFund();
		System.out.println(Interface.min_bal);
		//Interface.min_bal = 200; -> Cannt change the value of interface variable
		
		//dynamic polymorphism
		//child class object can be referred by parent interface reference method
		Interface a = new HSBCBank(); //WE can't access parent function only child method
		a.credit();
		a.debit();
		a.transfermoney();
		
	}

}
