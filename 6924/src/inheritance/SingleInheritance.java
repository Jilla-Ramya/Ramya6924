package inheritance;
class  Sem11
{
	public Sem11()
	{
		System.out.println("sem1");
	}
	int math,c,cpp;  
	void input()
	{
		math=50;
		c=60;
		cpp=70;
	}
	public void output()
	{
		
		System.out.println("Results of Smester-1 \n\n");
		System.out.println("Marks in Mathematics  "+math);
		System.out.println("Marks in C-language  "+c);
		System.out.println("Marks in CPP  "+cpp);
		System.out.println("-------------------\n\n");
	}
}
class Sem22 extends Sem11
{
	int java,dbms,eng;
	public Sem22()
	{
		System.out.println("sem2");
	}
	public void input2()
	{
		java=55;
		dbms=88;
		eng=65;
	}
	public void output2()
	{
		System.out.println("Results of Smester-2 \n\n");
		System.out.println("Marks in Java  "+java);
		System.out.println("Marks in DBMS "+dbms);
		System.out.println("Marks in English  "+eng);
		System.out.println("-------------------\n\n");
	}
}
public class SingleInheritance 
{
	public static void main(String[] args) 
	{
		Sem22 obj=new Sem22();
		
		obj.input();
		obj.input2();
		obj.output();
		obj.output2();
	}
}
