package control;

import java.util.Scanner;

public class simpleif 
{

	public static void main(String[] args) 
	{
		int marks;
		Scanner In =new Scanner(System.in);
		
		System.out.println("Enter your marks:");
		
		marks=In.nextInt();
		
		if(marks>=50)
		{
			System.out.println("pass");
		}
		

	}

}
