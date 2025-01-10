//WAP to to Create 1 SIB, 2 static method, 3 static variable 2 nonstatic variable. Use all variable in each methods and block, by using all ways.
package preProgramming;

public class Static_members 
{
 static
 {
	 System.out.println("Static Initializer block");
 }
public static void m1()
{
	System.out.println("Method 1");
	int res=a+b+c;
	System.out.println(res);
	
}
public static void m2()
{
	System.out.println("method 2");
	int res=a*b*c;
	System.out.println(res);
	
}
static int a;
static int b;
static int c;
int d;
int e;

Static_members(int d,int e)
{
	this.d=d;
	this.e=e;
}
public static void main(String[] args) 
{
	System.out.println("main Method");
	a=10;
	b=20;
	c=30;
	Static_members sm=new Static_members(40,50);
	
	m1();
	m2();
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(sm.d);
	System.out.println(sm.e);
}
}
