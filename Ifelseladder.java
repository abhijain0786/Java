/**
 * @(#)Ifelseladder.java
 *
 *
 * @author 
 * @version 1.00 2014/4/1
 */


public class Ifelseladder
{
	public static void main (String[] args) 
	//	throws java.io.IOException
		{
			int i=2;
			/*System.out.println("Enter number:");
			i=(int) System.in.read();*/
			{
				if(i==1)
				System.out.println("The value of i=1");
				else if(i==2)
				System.out.println("The value of i=2");
				else if(i==3)
				System.out.println("The value of i=3");
				else if(i==4)
				System.out.println("The value of i=4");
				else if(i==5)
				System.out.println("The value of i=5");	
				else
				System.out.println("i is not between 1 and 5");			
			}
		}
}