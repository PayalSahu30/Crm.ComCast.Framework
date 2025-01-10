package Stack;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Set_
{
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(10);
	al.add(40);
	al.add(50);
	al.add(10);
	al.add(40);
	al.add(30);
	System.out.println(al);
	
	LinkedHashSet lh=new LinkedHashSet(al);
	System.out.println(lh);
}
}
