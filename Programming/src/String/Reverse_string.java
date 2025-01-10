package String;

import java.util.Iterator;

public class Reverse_string
{
public static void main(String[] args) {
	String str="welcome to hadapsar pune";
    String [] st= str.split(" ");
   
    for (int i = 0; i < st.length/2; i++) {
		String temp=st[i];
		st[i]=st[st.length-1-i];
		st[st.length-1-i]=temp;
	}
    for (int i = 0; i < st.length; i++) {
		System.out.print(st[i]+" ");
	}
    
    
}
}