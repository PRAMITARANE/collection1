package SETDEMO;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<>();
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
