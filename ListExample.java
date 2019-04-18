package BasicJavaPrgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	
	void accessingArray()
	{
		List<String> lstVar=new ArrayList<String>();
		lstVar.add("Saran");
		lstVar.add("Ram");
		lstVar.add("Sunlife");
		
		Iterator<String> itr = lstVar.iterator();
		
		while (itr.hasNext()){
			System.out.println((String) itr.next());
		
		}
		
	}
	
	public static void main(String arg[])
	{
		ListExample obj=new ListExample();
		obj.accessingArray();
	}
}
