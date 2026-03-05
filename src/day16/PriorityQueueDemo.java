package day16;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());  //max heap
		
		//bag me stones  5 2 9 8 1	,	5 2 1 1,   1 1 3, 1 2
		
		//1		1		
		//1
		
		Iterator<Integer> itr=pq.iterator();
		
		if(itr.hasNext())
			pq.remove();
		
		System.out.println("2 kg stone left in the bag or no stones left");
	}

}
