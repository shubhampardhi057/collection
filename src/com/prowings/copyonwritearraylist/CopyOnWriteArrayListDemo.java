package com.prowings.copyonwritearraylist;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
	
	public static void main(String[] args) {
		
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
		

		list.add("AAA");
		list.add("BBB");
		list.add(null);
		list.add("AAA");
		
		
        System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add("zzz"); //do not thorws ConcurrentModificationException
//			itr.remove();  // iterator's remove method throws UnsupportedOperationException

		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		ListIterator<String> ltr = list.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			list.add("zzz"); //do not thorws ConcurrentModificationException
			ltr.remove();  // iterator's remove method throws UnsupportedOperationException
		}
		
		
		
		
		
		
		
		
		
		
	}

}
