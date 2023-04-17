package LISTDEMO;
import java.util.Iterator;
import java.util.LinkedList;

public class LINKEDLISTDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList <Integer> studList =  new LinkedList <>();
 studList.add(100);
 studList.add(20);
 studList.add(45);
 studList.add(400);
 studList.add(10);
 studList.add(400);
 studList.add(80);
 
 System.out.println("prints the size of the collection:" +studList.size());
 System.out.println("checks whether the collection is empty:" +studList.isEmpty());
 
  // for (int i:studList){
// 	 System.out.println(i);
//  }
  // Iterator
  Iterator<Integer> itr =studList.iterator(); // works in forward direction
  
  while(itr.hasNext()){ 
	
	  System.out.println(itr.next());
	}
	}

	}
