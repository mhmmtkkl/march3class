package march3class;

import java.util.ArrayList;
import java.util.List;

public class march3class {

	public static void main(String[] args) {
		
		System.out.println("is there any duplicate");
		int []as = {1,2,3,7,5,6,7};
		ArrayList<Integer> aa=new ArrayList<>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		aa.add(6);
		aa.add(7);
		aa.add(8);
		aa.add(9);
		
		
		
		System.out.println(aarray(as));
				
		System.out.println(arrray(aa));
		
	}
	
	public static boolean aarray(int[] a) {
		
		for (int i=0;i<a.length;i++ ) {
			for(int j =i+1 ;j<a.length;j++) {
				if(a[i]==a[j]) {
					return false;
				}
				
			}
		}
		
		
		return true;
	 }
	

	 

	public static boolean arrray(List<Integer> a) {
		 
		for (int i=0;i<a.size();i++ ) {
			for(int j =i+1 ;j<a.size();j++) {
				if(a.get(i)==a.get(j)) {
					return false;

				}
				
			}
		}
		
		
		return true;
		
	}
	
	
}
