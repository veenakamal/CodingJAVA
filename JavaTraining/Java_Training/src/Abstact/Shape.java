package Abstact;

public abstract class Shape {
	int color;
	
	Shape(){
		System.out.println("Shape class Constructor");
	}
	
	abstract void drawing(); //Body class as well as non body class also, Cant create object of interface or abstract class
	
	public void fill() {
		System.out.println("Fill");
		
	}
	
	
	

}
