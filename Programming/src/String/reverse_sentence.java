package String;

public class reverse_sentence {
	public static void main(String[] args) {
		String str="welcome to hadapsar pune";
	    String [] st= str.split(" ");
	    for (int i = st.length-1; i>=0; i--) {
			System.out.print(st[i]+" ");
		}
}
}