package BasicJavaPrgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnString 
{

	void accessingArray()
	{
		String [] strArray = {"Ram","Gopal","Tarun","Karthik"};
		for(int i=0;i<4;i++)
		{
			System.out.println("Display from the Array "+i+" = " +strArray[i]);
			
		}
		
		for(String i : strArray)
		{
			System.out.println("Display For Strin i : Array  " +i);
		}
		
		List<String> lstVar=new ArrayList<String>();
		lstVar.add("Saran");
		lstVar.add("Ram");
		lstVar.add("Sunlife");
		
		Iterator<String> itr = lstVar.iterator();
		
		while (itr.hasNext()){
			System.out.println((String) itr.next());
		
		}
		
	}
	
	public String reverse(String str)
	{
		int j = str.length();
		char[] chVar = new char[j];
		
		for(int i=0; i < str.length(); i++ )
		{
			chVar[i]=str.charAt(i);
		}
		/*
		for (char t : chVar)
		{
			System.out.println("T is  "+t);
			
		}
		*/
		// To reverse
		char[] chRevereVar = new char[j];
		System.out.println(j);
		for(int i=str.length()-1, irev=0; i >= 0; i-- )
		{
			chRevereVar[irev]=str.charAt(i);
			System.out.println("the I output is  "+i);
			irev++;
		}
		str="";
		for (char t : chRevereVar)
		{
			System.out.println("Reverse T is  "+t);
			str=str+t;
		}
		
		return str;
	}
}
