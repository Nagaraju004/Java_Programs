public class Star
{
 
	public static void main(String args[])
	{
		int i, j, k;
		for (i = 1; i <= 5; i++)
		{
			for (j = i; j < 5; j++)
			{
				System.out.print(" ");
			}
			for (k = 1; k < (i+1); k++)
			{
				System.out.print(" *");
			}
			System.out.println("");
		}
	}
}