package Stack;

import java.util.Stack;

public class Staack
{
public static void main(String[] args)
{
	Stack st =new Stack();
	
	System.out.println(st.isEmpty());
	//System.out.println(st.peek());		//EmptyStackException 
	//System.out.println(st.pop());		//EmptyStackException 
	st.push(10);
	st.push("Qsp"); 
	st.push(20); 
	st.push("jsp"); 
	st.push(null);
	st.push("a");
   System.out.println(st);
   System.out. println(st.isEmpty());
   System.out.println(st.peek()); 
   System.out.println(st.peek());
   System.out.println(st.peek());
   System.out.println(st.pop());
   System.out.println(st.pop());//null
   System.out.println(st);//
	
}
}
