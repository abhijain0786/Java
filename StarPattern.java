//Star pattern using For loop
class StarPattern
{
	public static void main(String[] args)
	{
		int row,noofstar;
		for(row = 1;row <= 10;row++)
		{
			for(noofstar = 1; noofstar <= row; noofstar++)
			{
				System.out.print("*");
			}
			System.out.println();//next line
		}
	}
}
//difference between print and println ????