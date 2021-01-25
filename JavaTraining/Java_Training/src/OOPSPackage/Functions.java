package OOPSPackage;

public class Functions {

	public static void main(String[] args) {
		//Method and Function is same thing, Main method is only function in this class
		//Non static method
		Functions obj = new Functions();
		int z = obj.division(100, 20);
		System.out.println(z);
		int l = obj.pqr();
		System.out.println(l);
		
		String str = obj.qa();
		System.out.println(str);
		
		
		
	}
	
	public void test() {
		System.out.println("test method");
	}
	
	public int pqr() { //doesn't return any value --> Void
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;	
	}
	
	public String qa() {
		System.out.println("QA Method");
		String s = "Selenium";
		return s;
	}
	
	//return type is integer
	//x,y input arguments
	public int division(int x, int y) {
		System.out.println("Division");
		int d = x/y;
		return d;
		
	}
}
