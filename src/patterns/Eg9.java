package patterns;

public class Eg9 {

	public static void main(String[] args) {
		// * * * *
		//  * * *
		//   * *
		//    *
		   
		//rows-->4 star-->4 space-->0
		int star=4;
		int space=0;
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=space;j++)
		{
		System.out.print(" ");
		}
		for(int k=1;k<=star;k++)
		{
		System.out.print("* ");//space adjust keli
		}
		System.out.println();
		star--;
		space++;
		}
		}
		
}
