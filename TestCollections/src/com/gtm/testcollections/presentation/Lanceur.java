package com.gtm.testcollections.presentation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lanceur {

	public static void main(String[] args) {
		
		List al = new ArrayList();
		al.add(12);
		al.add("Une chaine");
		al.add(12.2f);
		al.add("d");
		al.add(12);
		
		for(int i = 0; i < al.size(); i++)
			System.out.println("Donnée: " + al.get(i) + "[" + i +"]");
		
		List<String> al2 = new ArrayList<String>();
		al2.add("Une autre chaine");
		al2.add("d");
		al2.add("d");
		
		System.out.println("\n");
		
		for(int i = 0; i < al2.size(); i++)
			System.out.println("Donnée: " + al2.get(i) + "[" + i +"]");
		
		Set s = new HashSet();
		s.add(3);
		s.add(2);
		s.add(1);
		s.add(3);
		
		System.out.println("\n");
		
		for(int i = 0; i < s.size(); i++)
			System.out.println("Donnée: " + s.toArray()[i] + "[" + i +"]");
		
		
		System.out.println("\n");
		
		Iterator it = s.iterator();
		while(it.hasNext())
			System.out.println("Donnée: " + it.next());
		
		Set<Integer>s2 = new HashSet<Integer>();
		s2.add(3);
		s2.add(2);
		s2.add(1);
		s2.add(3);
		
		System.out.println("\n");
		
		for(int i = 0; i < s2.size(); i++)
			System.out.println("Donnée: " + s2.toArray()[i] + "[" + i +"]");
		
		
		System.out.println("\n");
		
		it = s2.iterator();
		while(it.hasNext())
			System.out.println("Donnée: " + it.next());
		
	}

}
