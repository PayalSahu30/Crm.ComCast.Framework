//WAP to achieve method overloading for main method.
package preProgramming;

public class Main_method_override
{
public static void main(String[] args) 
{
	System.out.println("Main Start");
	main();
	main("Overloaded 2nd time");
	System.out.println("Main End");
}
public static void main()
{
	System.out.println("overloaded method");
}

public static void main(String str)
{
	System.out.println(str);
}
}
