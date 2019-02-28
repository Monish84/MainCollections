package collections;
import java.util.PriorityQueue;
public class PriorityQueueTest {
	public static void main(String[] args)
    {
		PriorityQueue<String> queue=new PriorityQueue<String>(); 
		
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");
        queue.add("Baelish");
        /*
         * What I am doing here is removing the highest
         * priority element from Queue and displaying it.
         * The priority I have set is based on the string
         * length. The logic for it is written in Comparator
         */
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());
        
        }
    }
}
