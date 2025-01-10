//WAJP to iterate all the elements of hashset in forward as well as backward direction using list iterator
package Stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;

public class hashset {
public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(12);
	hs.add("qsp");
	hs.add('c');
	hs.add(12.2);
	hs.add(null);
	hs.add(true);
	System.out.println(hs);
	
	ArrayList al=new ArrayList(hs);
	ListIterator li= al.listIterator();
	//Forward 
	while(li.hasNext())
	{
		System.out.print(li.next()+" ");
	}
	
	System.out.println();
	
	
	//backward
	while(li.hasPrevious())
	{
		System.out.print(li.previous()+" ");
	}
}
}
