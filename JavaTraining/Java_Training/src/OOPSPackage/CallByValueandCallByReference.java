package OOPSPackage;

public class CallByValueandCallByReference {
	int p;
	int q;

	public static void main(String[] args) {
		CallByValueandCallByReference obj = new CallByValueandCallByReference();
		int x = 10;
		int y = 20;
		obj.testsum(x, y); 	//CallbyValue or PassByValue
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	public int testsum(int a, int b) {
		a = 30;
		b = 20;
		int c = a + b;
		return c;
	}
	
	public void swap(CallByValueandCallByReference t){
		t.p = 100;
		t.q = 200;
		int temp;
		temp = t.p; // temp = 100
		p = t.q; // p = 200
		t.q = temp; //q = 100
		
		
		
	}

}
