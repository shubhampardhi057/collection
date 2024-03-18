package com.prowings.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		
		PriorityQueue pq = new PriorityQueue<>();
		
		
		pq.add(10);
		pq.add(20);
		pq.add(50);
		pq.add(70);
		pq.add(80);
		pq.add(30);
		pq.add(40);
		pq.add(60);
		
		
		System.out.println(pq);
		
		System.out.println(pq.offer(20));
		
		System.out.println(pq.element());
		
		System.out.println(pq.peek());
		
		System.out.println(pq.poll());
		
		System.out.println(pq.size());
		
		System.out.println(pq.remove(20));
		
		System.out.println(pq.contains(40));
		
		
		Iterator itr = pq.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		System.out.println(pq);
	}

}
