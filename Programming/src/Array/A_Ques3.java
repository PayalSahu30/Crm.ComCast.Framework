//WAJP to find the triplet of sum.

package Array;

public class A_Ques3 
{
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int target=9;
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				for (int k =j+1;  k< arr.length; k++)
				{
					
				if(arr[i]+arr[j]+arr[k]==target)
				{
					System.out.println("[" +i+","+j+","+k+"]");                  //indexes
					System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);			// values
				}
			    }
			}
		}
}}