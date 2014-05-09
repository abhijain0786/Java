//input intacter/number from keyboard
public class Ip_Key
{
	public static void main(String[] args)
	throws java.io.IOException 
	{
		char i;
		System.out.println("Input a number from key board:-");
		i= (char) System.in.read();
		System.out.println("The key is" +i);
	}
}
//if we use "int" in place of "char" then it will take the ASCII value of all integers and characters
//Only accepecting one character