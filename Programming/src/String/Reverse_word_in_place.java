package String;
public class Reverse_word_in_place 
{
	public static void main(String[] args) {
		String str="welcome to hadapsar pune";
	    String [] st= str.split(" ");
	    
	   for (int i = 0; i < st.length; i++) {
		   String rev="";
		   for (int j = st[i].length()-1; j>=0; j--)
		   {
			rev=rev+st[i].charAt(j);
			}
		   System.out.print(rev+" ");
	}

}
}