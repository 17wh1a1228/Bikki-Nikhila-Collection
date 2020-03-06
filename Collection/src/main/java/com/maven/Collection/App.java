package com.maven.Collection;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	Collection<Integer> c = new Collection<Integer>();
    	
    	c.add(1);
    	c.add(2);
    	c.add(3);
    	c.add(4);
    	c.add(5);
    	c.add(6);
    	c.add(7);
    	c.add(8);
    	c.add(9);
    	c.add(10);
    	
    	System.out.println("List : " + c);
    	System.out.println("Enter an element to add to the list : ");
    	int a = sc.nextInt();
    	c.add(a);
    	System.out.println("List after inserting an element: "+c);
    	System.out.println("Enter the position of the element to remove : ");
    	int rem = sc.nextInt();
    	c.remove(rem);
    	System.out.println("List after removing the element at position "+rem+" is : "+c);
    	System.out.println("Enter position of the element to fetch : ");
    	int pos = sc.nextInt();
    	System.out.println("Element at position "+pos+" is : "+ c.get(pos));
    }
}
