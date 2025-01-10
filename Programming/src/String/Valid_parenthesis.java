package String;

import java.util.Stack;

public class Valid_parenthesis 
{
	public static void main(String[] args) 
	{
	String s= "(){}[]";

	if(s.startsWith("}") || s.startsWith("]") || s.startsWith(")")
	 ||s.endsWith("{")|| s.endsWith("[")|| s.endsWith("("))
	{
		System.out.println("Invalid");
	}
	else
	{
		char [] ch=s.toCharArray();
		Stack<Character> st=new Stack<Character>();
		for (int j = 0; j < ch.length; j++) 
		{
		char c= ch[j];
		if(c=='{' || c=='[' ||c=='(')
		{
			st.push(c);
		}
		else if((c=='}' && st.peek()=='{')
			  ||(c==']' && st.peek()=='[')
			  ||(c==')' && st.peek()=='('))
		{
			st.pop();
		}
		else
		{
			st.push(c);
		}
		}
		
		if(st.isEmpty())
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	
	
}
}

