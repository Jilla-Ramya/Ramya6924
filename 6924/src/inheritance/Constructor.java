package inheritance;

class Area 
{
	
	public Area(int a)
	{
		int area= a*a;
		System.out.println("Side of square is "+a);
		System.out.println("Area of square is "+area); 
	}
	public Area(int l,int b) 
	{
		int area = l*b;
		System.out.println("Length of Rectangle "+l);
		System.out.println("Breadth of Rectangle "+b);
		System.out.println("Area of Rectangle is "+area); 
	}
	public Area(double pi, int r) 
	{
		double area = pi*r*r;
		System.out.println("Radius of Ciecle "+r);
		System.out.println("Area of Circle is "+area); 
	}
	}
	class ConstrcutorOverloading
	{
	public static void main(String args[])
	{
	Area obj1 = new Area(10);
	Area obj2 = new Area(101,20);
	Area obj3 = new Area(3.14, 4);
	}
	}