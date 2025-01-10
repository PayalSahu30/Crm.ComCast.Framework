
package Stack;

import java.util.ArrayList;

public class list_to_array
{
	public static void main(String[] args) {
		
	
ArrayList al=new ArrayList();
al.add(10);
al.add("qsp");
al.add(30);
al.add(true);
al.add('a');
al.add(12.2);
al.add(null);
System.out.println(al);
//Without Inbuild Methods
Object[] obj=new Object[al.size()];   //object[] can store all type of data
for (int i = 0; i < al.size(); i++) {
	obj[i]=al.get(i);
}
for (int i = 0; i < obj.length; i++) {
	System.out.print(obj[i]+" ");
}
System.out.println();
//with Inbuilt method
Object[] array=al.toArray();
for (int i = 0; i < array.length; i++) {
	System.out.print(array[i]+" ");
}

}
}

