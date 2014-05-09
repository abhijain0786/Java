/**
 * @(#)Triangle1.java
 *
 *
 * @author 
 * @version 1.00 2014/4/1
 */


public class Triangle1 
{
	public static void main (String[] args)
	{
		int i,j;
		for(i=1;i<=6;i++)
		{
        	for(j=1;j<i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
    	}
    }
}

/*Right angle trinagle starting from left
1
12
123
1234
12345
*/