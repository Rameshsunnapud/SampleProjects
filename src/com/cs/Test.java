package com.cs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(50);
		l.add(20);
		l.add(30);
		System.out.println(l);
		l.add(2,90);
		l.remove(0);
		
		//l.clear();
		System.out.println(l);
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ArrayList<Integer> l2=new ArrayList<Integer>();
		l2.add(10);
		l2.add(50);
		l2.add(20);
		l2.add(30);
		System.out.println(l2);
		l2.add(2,90);
		l2.remove(0);
		
		
		System.out.println(l.equals(l2));
		//l.addAll(l2);
		//System.out.println(l);
		List<Integer> l3=Stream.of(l,l2).flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(l3);

	}

}
