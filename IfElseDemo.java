class IfElseDemo 
{
    public static void main(String args[])
	throws java.io.IOException
	{
        char testscore;
		System.out.println("Enter your numbers");
		testscore = (char) System.in.read(); 
        if (testscore >= 75) 
		{
            System.out.println("You are passed");
        }
		else 
		{
			System.out.println("You are fail");
        }
		
    }
}
//Always taking ASCII value ????
