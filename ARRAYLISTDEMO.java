package LISTDEMO;
import java.util.ArrayList;
import java.util.Iterator;

public class ARRAYLISTDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList <Integer> studList =  new ArrayList <>();
 studList.add(100);
 studList.add(20);
 studList.add(300);
 studList.add(400);
 studList.add(500);
 studList.add(600);
 studList.add(700);
 
 System.out.println("prints the size of the collection:" +studList.size());
 System.out.println("checks whether the collection is empty:" +studList.isEmpty());
 
 for (int i:studList){
	 System.out.println(i);
 }
 // Iterator
  Iterator<Integer> itr =studList.iterator(); // works in forward direction
  
  while(itr.hasNext()){ 
	  System.out.println(itr.next());
	}

	}
}
