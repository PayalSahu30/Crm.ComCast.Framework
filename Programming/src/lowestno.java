
public class lowestno
{
public static void main(String[] args)
{
	int c1=74999;
	int c2=121999;
	int c3=26999;
	
	int lowest=c1<c2 && c1<c3? c1: c2<c1 && c2<c3?c2: c3;
	System.out.println(lowest);
}}
