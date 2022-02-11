package control;

import java.util.Scanner;

public class elseifladder
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month between 0 to 12 Month=");
		int month= sc.nextInt();
		if(month==0)
		{
			System.out.println("\n January");
		}
		else if(month==1)
		{
			System.out.println("\n February");
		}
		else if(month==2)
		{
			System.out.println("\n March");
		}
		else if(month==3)
		{
			System.out.println("\n April");
		}
		else if(month==4)
		{
			System.out.println("\n May");
		}
		else if(month==5)
		{
			System.out.println("\n june");
		}
		else if(month==6)
		{
			System.out.println("\n july");
		}
		else if(month==7)
		{
			System.out.println("\n August");
		}
		else if(month==8)
		{
			System.out.println("\n september");
		}
		else if(month==9)
		{
			System.out.println("\n October");
		}
		else if(month==10)
		{
			System.out.println("\n November");
		}
		else if(month==11)
		{
			System.out.println("\n December");
		}
		
		else
		{
			System.out.println("\n Wrong input");
		}

	}

}
