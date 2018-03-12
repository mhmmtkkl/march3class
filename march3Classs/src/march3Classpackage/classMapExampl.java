package march3Classpackage;


	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class classMapExampl {
		public static void main(String[] args) {
			//K,V
			Map<String, Double> menu = new HashMap<>();
			menu.put("Coffeee", 2.99);
			menu.put("Cappucino", 3.99);
			menu.put("Hot Chocolate", 3.49);
			menu.put("Hot Chocolate", 3.55);
			//How to find out how many elements
			System.out.println(menu.size());
			System.out.println(menu);
			
			//How much is Coffee
			System.out.println(menu.get("Coffee"));
			//get all keys
			System.out.println(menu.keySet());
			System.out.println(menu.values());
			
			//remove
//			menu.remove("Coffee");
			System.out.println(menu);
			
			menu.replace("Coffee", 2.99, 2.33);
			System.out.println(menu);
			
			if(menu.containsKey("Coffee")) {
				System.out.println("Coffee is there");
			}
			//How to find key by value.
			//need to loop and check values
			
			//menu.put("Coffee", 2.99);
			menu.put("reg Coffee",menu.get("Coffee"));
			
			System.out.println(menu);
			
		}
	}
 
