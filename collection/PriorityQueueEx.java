package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue<String> queue= new PriorityQueue<String>();
queue.add("Jasmin");
queue.offer("Lotus");
queue.offer("Rose");
queue.offer("Mogra");
queue.offer("Lilly");
//queue.offer(null); you can't store null 

System.out.println("Queue :"+queue);
System.out.println("head of queue :"+queue.element());
System.out.println("removing element :"+queue.remove());
System.out.println("after removing queue : "+queue);
System.out.println("removing queue : "+queue.poll());
System.out.println(" After removing queue : "+queue);
	}

}
