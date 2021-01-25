package OOPSPackage;

public class Method_Overloading {

	public static void main(String[] args) {
		Method_Overloading obj = new Method_Overloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10,20);
		//Method overloading is same with different arguments or parameter within same class
		//you cannot create method inside the method
		//different method with same name is not allowed within same class
		//Main method can be overloaded
	}
	
	public static void main(int p) {
		
	}
	
	public static void main(int p, int q) {
		
	}

	public void sum() {
		System.out.println("Sum");
	}
	
	public void sum(int i) {
		System.out.println("One parameter");
		System.out.println(i);
	}
	
	public void sum(int j, int k) {
		System.out.println("Two Parameter");
		System.out.println(k+j);
	}

}
