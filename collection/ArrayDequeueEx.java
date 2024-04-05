package collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> queue = new ArrayDeque<String>();
		queue.add("Coffee");
		queue.offer("Tea");
		queue.offer("Ice-Cream");
		queue.offerFirst("Sandwitch");
		queue.offerLast("Pizza");
		queue.offer("Burger");
		
		//queue.offer(null); you caan't insert null
		
		System.out.println("Dequeue :"+queue);
		System.out.println("removing 1st element : "+queue.pollFirst());
        System.out.println("Dequeue : "+queue);
        System.out.println("removing last element : "+queue.pollLast());
        System.out.println("Dequeue : "+queue);
        System.out.println("head of dequeue :"+queue.peek());
        

	}

}
