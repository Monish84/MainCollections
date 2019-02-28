package collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class ArrayDequeTest {
	public static void main(String args[]){
		//Create ArrayDeque  object.
		Deque arrayDeque  = new ArrayDeque();
 
		//Add objects to the ArrayDeque.
		arrayDeque.add("Gourav");
		arrayDeque.add("Neeraj");
		arrayDeque.add("Deepak");
		arrayDeque.add("Mohan");
		arrayDeque.add("Parmender");
 
		//Print the ArrayDeque object.
		System.out.println("ArrayDeque elements:");
		System.out.println(arrayDeque);
 
		//Print the ArrayDeque elements using iterator.
		Iterator iterator1=arrayDeque.iterator();
		System.out.println("ArrayDeque elements " +
				"using iterator:");
		while(iterator1.hasNext()){  
		   System.out.println(iterator1.next());  
		}
 
		//Print the first element of the ArrayDeque.
		System.out.println("First element: " 
				+ arrayDeque.getFirst());
 
		//Print the last element of the ArrayDeque.
		System.out.println("Last element: " 
				+ arrayDeque.getLast());
 
		//Remove the first element of the ArrayDeque.
		arrayDeque.pollFirst();
 
		//Remove the last element of the ArrayDeque.
		arrayDeque.pollLast();
 
		//Print the ArrayDeque object.
		System.out.println("ArrayDeque elements " +
				"after manipulation:");
		System.out.println(arrayDeque);
 
		//Print the ArrayDeque elements using iterator.
		Iterator iterator2=arrayDeque.iterator();
		System.out.println("ArrayDeque elements after " +
				"manipulation using iterator:");
		while(iterator2.hasNext()){  
		   System.out.println(iterator2.next());  
		}
	}
}
