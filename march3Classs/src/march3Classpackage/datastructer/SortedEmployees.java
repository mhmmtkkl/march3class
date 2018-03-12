package march3Classpackage.datastructer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedEmployees {
	public static void main(String[] args) {
		String str1= "AA";
		String str2 = "bb";
		System.out.println(str1.compareTo(str2));
		//equals -> 0
		//firstone is larger -> 1
		//firstone is smaller -> negative
		
		Employee emp1 = new Employee(33, "BBob");
		Employee emp2 = new Employee(3, "Mario");
		Employee emp3 = new Employee(43, "Bob");
		Employee emp4 = new Employee(1, "Maria");
		
		System.out.println(emp1.compareTo(emp2));
		
		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		System.out.println(emps);
		
		Collections.sort(emps);
		
		System.out.println(emps);

	}
}