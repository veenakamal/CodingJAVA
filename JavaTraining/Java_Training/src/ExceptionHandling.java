
public class ExceptionHandling {
	//int a = 10;
	//static ExceptionHandling obj;

	public static void main(String[] args) {
		//Uncaught Exception - Arithmatic Expression
		//int i = 9/0;
		//System.out.println(i); //Compiler will not able to tell the error, uncaught exception
		
		//Caught Exception - Immediately will get to known  about it, while we write the code
		//Thread.sleep(2000);
		
		//NullPointer Exception
		/*ExceptionHandling obj = new ExceptionHandling();
		obj = null;
		System.out.println(obj.a); //Object is not declare properly or given null value to reference*/
		
		
		//System.out.println(obj.a);// Object is not created properly, trying to access the variable. Null Pointer Exception
		
		//Excception
		//1. Try - Catch Block
		
		try {
			int i = 9/0;//this code will give exception or throw an exception
		}
		catch(ArithmeticException e){
			e.printStackTrace(); // give u the error message or log the error code with line number
			System.out.println(e.getMessage());
			
			
		}
		System.out.println("ABC");
	}

}
