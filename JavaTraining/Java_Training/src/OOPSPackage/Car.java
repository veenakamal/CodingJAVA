package OOPSPackage;

public class Car {
	int mod;
	int wheel;
	

	public static void main(String[] args) {
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2020;
		a.wheel = 5;
		
		b.mod = 2020;
		b.wheel = 3;
		
		c.mod = 2010;
		c.wheel =2;
		
		System.out.println(a.mod);
		System.out.println(b.mod);
		
		System.out.println("Shifting of reference");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		b.mod=30;
		c.mod=20;
		System.out.println(a.mod);
		System.out.println(c.mod);
		System.out.println(b.mod);

		
		
	}

}
