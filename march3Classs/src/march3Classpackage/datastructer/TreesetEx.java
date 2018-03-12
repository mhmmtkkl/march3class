package march3Classpackage.datastructer;

import java.util.*;

public class TreesetEx {
	public static void main(String[] args) {
		Set<String> set =             new TreeSet<>();
		SortedSet<String> sortedSet = new TreeSet<>();
		
		set.add("bc");
		set.add("aaa");
		set.add("cc");
		set.add("cc");
		
		sortedSet.add("bc");
		sortedSet.add("aa");
		sortedSet.add("cc");
		sortedSet.add("cc");
		
		System.out.println(set);
		System.out.println(sortedSet);
		
		
	}
}