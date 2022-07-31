package com.greatlearning.main;

import java.util.Scanner;
import java.util.LinkedList;

public class Driver {

	public static void main(String[] args) {
		int i,j=1, index;
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		LinkedList<Integer> L2 = new LinkedList<Integer>();
		LinkedList<Integer> L3 = new LinkedList<Integer>();
		
		System.out.println("Enter the total no. of floors in the building");
		int tf = sc.nextInt();
		int maxSize = tf;

		for (i=0; i<tf; i++) {
			System.out.println("Enter the floor size given on day" + (i+1));
			int a = sc.nextInt();
			L1.add(a);
			
		}
		
		System.out.println("The order of construction is as follows");
		
		while(!L1.isEmpty() || !L2.isEmpty()) {
			if(L1.peek() != maxSize) {
				L2.add(L1.poll());
				System.out.println("Day " + j);
				System.out.println(" ");
				j++;
			}
			else {
				System.out.println("Day "  + j);
				j++;
				L3.add(L1.poll());
				maxSize = maxSize-1;
				while(L2.contains(maxSize)) {
					index = L2.indexOf(maxSize);
					L3.add(L2.get(index));
					L2.remove(index);
					maxSize = maxSize-1;
				}
				System.out.println(L3);
				System.out.println(" ");
				L3.clear();
			}
			
		}
		sc.close();
	}
}
