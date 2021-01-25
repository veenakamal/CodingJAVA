
public class Loops {

	public static void main(String[] args) {
		//#While Loop
		//disadvantage of While Loop -> It will generate infinite Loop, if we dont give incremental or decremental part
		
		int i =0; //Initialization
		while(i<=20) { //Conditional
			System.out.println(i);
			i++; //incremental and decremental
		}
		System.out.println("__________________");
		//#For Loop
		for(int j=0;j<=10;j++)//Initialization, Conditional, Incremental/decremental
		{
			System.out.println(j);
		}
		System.out.println("__________________Reverse");
		//#For Loop
		for(int k=10;k>=-10;k--)//Initialization, Conditional, Incremental/decremental
		{
			System.out.println(k);
		}
		
		
			
	}

}
