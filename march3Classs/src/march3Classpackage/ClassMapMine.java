package march3Classpackage;

import java.util.HashMap;
import java.util.Map;

 

public class ClassMapMine {
public static void main(String[] args) {
		Map <String,Double> CarPrice= new HashMap <> ();
		
		CarPrice.put("BMW", 4000.00);
		CarPrice.put("Toyota", 3000.00);
		CarPrice.put("Mercedes", 6000.00);
		
		System.out.println(CarPrice);
		System.out.println(CarPrice.size());
		
		System.out.println(CarPrice.get("BMW"));
		
		System.out.println(CarPrice.keySet());
		System.out.println(CarPrice.containsValue("3000.00"));
		CarPrice.put("Honda", CarPrice.get("Toyota"));
		System.out.println(CarPrice);
		
		CarPrice.put("Hyundai", 3500.00);
		System.out.println(CarPrice);
		
		
}
}
