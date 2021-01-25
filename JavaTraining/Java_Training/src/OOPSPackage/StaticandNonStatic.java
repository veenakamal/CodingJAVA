package OOPSPackage;

public class StaticandNonStatic {
	String name = "Tom"; //non static global var
	static int age = 25; //static global var

	public static void main(String[] args) {
		//Static can we call directly, which creating object
		sum();
		StaticandNonStatic.sum(); //Calling by classname
		System.out.println(age);
		//Non static, we need to create obj and call the method and var
		StaticandNonStatic obj = new StaticandNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//Can we call the object by reference
		obj.sum(); //Warning will be given
		
		
	}
	
	public void sendMail() {
	System.out.println("Send Mail Method");
	}
	
	public static void sum() {
		System.out.println("Sum");
	}

}
