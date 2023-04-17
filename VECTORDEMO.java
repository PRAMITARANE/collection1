package LISTDEMO;

import java.util.Iterator;
import java.util.Vector;

public class VECTORDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> vc = new Vector<>();
vc.add("P");
vc.add("R");
vc.add("A");

Iterator <String> itr = vc.iterator();
while (itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
