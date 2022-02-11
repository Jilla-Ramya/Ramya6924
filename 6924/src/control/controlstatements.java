package control;

import java.util.Scanner;

public class controlstatements {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int number= sc.nextInt();
		
		switch(number) 
		{
				case 1:System.out.println("10");
				break;
				
				case 2:System.out.println("30");
				break;
				
				default:
					 System.out.println("Not in 10,30");
		}

	}

}
