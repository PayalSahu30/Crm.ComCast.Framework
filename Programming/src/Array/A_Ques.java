package Array;

public class A_Ques
{
public static void main(String[] args) {
int[] arr= {5,9,12,16,25};
int k=6;
System.out.println(untilDivide(arr,k));
}
	
public static int untilDivide(int[] a, int k)
{
int count=0;
for (int i = 0; i < a.length; i++)
{
     count=count+ a[i]%k;
}

return count;
}
}