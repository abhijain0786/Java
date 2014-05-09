//Scope of variable
class VarScope
{
	public static void main(String[] args)
	{
		int x,y;
		x=12;
		if(x==12)
		{
			y=24;
			x=y*2;
		}
		System.out.println("X= " +x);
	}
}