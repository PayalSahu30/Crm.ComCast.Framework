package preProgramming;

public class Increment_decrement 
{
public static void main(String[] args) {
		
		
		int a=5;
		int b=++a -5;
		int c=5 + ++b - ++a;
		--a;
		a= ++c -c;
		System.out.println(a+" "+b+" "+ c+" ");

}
}

