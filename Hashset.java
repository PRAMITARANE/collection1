package SETDEMO;

import java.util.HashSet;
import java.util.Iterator;


public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");

		Iterator <String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
