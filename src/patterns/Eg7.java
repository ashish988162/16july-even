package patterns;

public class Eg7 {

	public static void main(String[] args) {
		//*******
		// *****
		//  ***
		//   *
		//rows-->4 star-->7 space-->0
		//outer for loop-->rows
		int space=0;
		int star=7;
		for(int i=1;i<=4;i++)
		{
		for(int k=1;k<=space;k++)
		{
		System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
		System.out.print("*");
		}
		System.out.println();
		star=star-2;
		space++;
		}
		}
		}
	
