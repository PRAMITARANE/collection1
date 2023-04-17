package SETDEMO;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> tst = new TreeSet<>();
		tst.add("R");
		tst.add("A");
		tst.add("H");
		tst.add("U");
		tst.add("L");

		Iterator <String> itr = tst.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}



	}

}
