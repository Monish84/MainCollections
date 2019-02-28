package collections;
import java.util.Deque;
import java.util.LinkedList;
public class DequeExample {
	public static void main(String[] args){
		Deque deque=new LinkedList();

		//Adding element to the Deque
		deque.add(44);
		deque.offer("test");
		deque.offerFirst("Hello");
		deque.addLast("Roseindia");
		deque.offer(11);

		System.out.println("size of deque : "+deque.size());
		System.out.println("Elements in deque: "+deque);

		//Deleting element from deque
		deque.remove();
		deque.pollFirst();
		System.out.println("size of deque : "+deque.size());
		System.out.println("Elements in deque: "+deque);

		System.out.println("Last element in deque: "+deque.peekLast());
		System.out.println("Top element of deque : "+deque.element());

		}
}
