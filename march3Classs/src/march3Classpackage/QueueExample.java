package march3Classpackage;



import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		//FIRST IN FIRST OUT
		Queue<String> q = new LinkedList<>();//new PriorityQueue<>();
		q.add("Delta");
		q.add("Aamerican");
		q.add("Qatar");
		q.add("Turkish");
		
		System.out.println(q);
		
		System.out.println(q.peek());
		
	}
}