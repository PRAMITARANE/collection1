package LISTDEMO;

import java.util.Iterator;
import java.util.Stack;


public class STACKDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack <String> stk = new Stack<>();
		stk.add("P");
		stk.add("R");
		stk.add("A");
		
		stk.pop();

		Iterator <String> itr = stk.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
