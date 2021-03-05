import java.util.*;
public class Pattern
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String patternString = s.next();
		int patternLength = patternString.length();
		int midlen = patternLength/2;
		for(int i=0;i<patternLength;i++)
		{
			for(int j=0;j<patternLength;j++)
			{
				
				if(i+j+1==patternLength)
				{
					int mid = midlen;
					for(int z=j; z<patternLength; z++)
					{
						System.out.print(patternString.charAt((int)mid++%patternLength));
					}
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}