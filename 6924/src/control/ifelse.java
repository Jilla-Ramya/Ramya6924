package control;

import java.util.Scanner;

public class ifelse
{

	public static void main(String[] args)
	{
		int age;
		Scanner In=new Scanner(System.in);
		
		System.out.println("Enter your age:");
		
		age=In.nextInt();
		
		if(age>=50)
		{
			System.out.println("your age is greater than 50");
		}
		else
		{
			System.out.println("your age is lesser than 50");
		}

	}

}
