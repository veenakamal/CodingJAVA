package Abstact;

public class Base extends Shape {
	
	Base(){
		System.out.println("Test Class Constructor");
	}

	public static void main(String[] args) {
		
		/*Shape s = new Base();//Reference class
		s.drawing();
		s.fill();*/
		Base test = new Base();
		
		
		
	}
	
	void drawing() {
		System.out.println("Test --- Drawing");
	}

}
