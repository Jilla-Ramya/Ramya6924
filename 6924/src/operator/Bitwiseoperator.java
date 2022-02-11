package operator;

public class Bitwiseoperator 
{

	public static void main(String[] args)
	{
		int a=5;
		int b=7;
		
		System.out.println("a&b="+(a&b));//bitwise and
		
		System.out.println("a|b="+(a|b));//bitwise or
		
		System.out.println("a^b="+(a^b));//bitwise xor
		
		System.out.println("~a="+~a);//bitwise and
		
		a&=b;
		System.out.println("a="+a);
	}
}
