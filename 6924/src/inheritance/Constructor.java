package inheritance;

public class Constructor 
{
		public Constructor (int a) 
		//Area of square
		{
			int Constructor= a*a;
			System.out.println("Side of square is "+a);
			System.out.println("Area of square is "+Constructor); 
		}
		// Area of Rectangle
		public Constructor (int l,int b) 
		{
			System.out.println("\n------------------------------------");
			int Constructor  = l*b;
			System.out.println("Length of Rectangle "+l);
			System.out.println("Breadth of Rectangle "+b);
			System.out.println("Area of Rectangle is "+Constructor); 
		}
		// Area of Circle
		public Constructor (double pi, int r)
		{
			System.out.println("\n------------------------------------");
			double Constructor  = pi*r*r;
			System.out.println("Radius of Ciecle "+r);
			System.out.println("Area of Circle is "+Constructor); 
		}
class ConstrcutorOverloading
{
	public void main(String args[]) 
	{
		Constructor obj1 = new Constructor (10);
		Constructor obj2 = new Constructor(101,20);
		Constructor obj3 = new Constructor (3.14, 4);
	}
		
	}

}
