package control;

public class dowhile
{

	public static void main(String[] args) 
	{
		int i=1;
		int sum=0;
		do 
		{
			sum=sum+i;
			i++;
		}while(i<=10);
		System.out.println("\n\n\tThe Sum of 1 to 10 is..."+sum);
	}
}
