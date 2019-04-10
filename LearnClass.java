package BasicJavaPrgm;
import java.util.Date;

import BasicJavaPrgm.LearnChildClass;

public class LearnClass extends InheritClass
{

	public LearnClass(){
		System.out.println(" Starting :: LearnClass Constructor");
	}
	public void add(int i,int j){
		System.out.println("Inside a method");
		int z = i + j;
		System.out.println("The value of the added number is = "+z);
	}
	
	public static void main(String[] args) 
	{
		FileOperation obj=new FileOperation();
		obj.read();
		/*
		System.out.println("Time " +System.currentTimeMillis());
		Date date = new Date(System.currentTimeMillis());
		System.out.println("Time " + date.getDate());
		
		//LearnChildClass.print();
		//int iInput=0;
		/*
		try{
			System.out.print("Input Value = ");
			iInput = System.in.read();
			FileOperation obj = new FileOperation();
			
		} 
		catch(Exception e) {
			System.out.println("Expection details \n"+e);
		}
		
		LearnClass obj=new LearnClass();
		obj.add(10,20);
		LearnChildClass obj2 = new LearnChildClass();
		obj2.multiply(20, 40);
		
		LearnString objStr = new LearnString();
		objStr.accessingArray();
		// objStr.reverse("Laptop");
		System.out.println("the reserved for the word  "+ objStr.reverse("Laptop"));
		
		//System.out.println("the input value is  "+ iInput);
		
		 */
	}

}

