package OOPSConcept2;

public class TestCar {
	//static Polymorphism -- Compile time Polymorphism, Q
	//  one to many
	//Same number of arguments, method created called method Overriding
	public static void main(String[] args) {
		BMW obj = new BMW();
		obj.start();
		obj.theftSafety();
		obj.stop();
		obj.refuel();
		obj.engine();
		System.out.println("_______________________");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		//PArent class cant inheritance from child class, Where child class can inheritance parent class
		System.out.println("_______________________");
        
		//Top Casting
		Car c1 = new BMW();//Child class object can be referred by parent class reference variable -- Dynamic Polymorphism --> Run Time Polymorphism
        c1.refuel();
        c1.start();
        c1.stop();
        //We can refer the object, we cant use the property
        //Common method and parent method can be referred
        
        //Down Casting
        //BMW b1 = new car(); ITs not allowed, Parent cant be fit into child class
        BMW b1 = (BMW)new Car(); //Class cast Exception, ClassCastException
        
        

	}

}
