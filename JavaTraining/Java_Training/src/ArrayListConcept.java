
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		int a[] = new int[3];
		ArrayList ar = new ArrayList();
		ar.add(200);//0
		ar.add(300);//1
		ar.add(400);//2
		System.out.println(ar.size());
		
		ar.add(100);//3
		ar.add(500);//4
		System.out.println(ar.size());
		
		ar.add("Tom");//5
		ar.add("Hello");//6
		ar.add(12.33);//7
		ar.add("M");//8
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));
		System.out.println("_______________________");

		//System.out.println(ar.get(9));//IndexoutofboundException, beyond the size error message is given
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(200);
		//ar1.add("Tom");
		
		
		Employee e1 = new Employee("Veena",27,"QA");
		Employee e2 = new Employee("Shaurya",27,"QA");
		Employee e3 = new Employee("Maitri",27,"QA");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//Iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//Addall Method
		
	}

}
