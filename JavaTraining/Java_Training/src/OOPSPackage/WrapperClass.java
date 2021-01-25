package OOPSPackage;

public class WrapperClass {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x+100);
		
		//data conversion String to Int
		int i = Integer.parseInt(x);
		System.out.println(i+100);
		
		//String to double conversion
		String y ="12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to Boolean conversion
		String z = "true";
		//boolean w = boolean.parseboolean(z);
		//System.out.println(w);
		
		//int to string conversion
		int a = 10;
		String s = String.valueOf(a);
		System.out.println(s+20);
		
		String u ="100A";
		Integer.parseInt(u); //Numberformat Exception
		
	}

}
