/**
 * @(#)ASCIIvalue.java
 *
 *
 * @author 
 * @version 1.00 2014/4/1
 */


public class ASCIIvalue 
{
	public static void main (String[] args) 
	throws java.io.IOException
	{
		int i;
		System.out.println("Enter the value from Keyboard");
		i=(int)System.in.read();
		System.out.println("The ASCII value is " +i);
	}
}