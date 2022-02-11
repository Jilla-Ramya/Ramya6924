package inheritance;
class  Sem1
{
	public Sem1()
	{
		System.out.println("Sem1");
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
class Sem2 extends Sem1
{
	int java,dbms,eng;
	public Sem2()
	{
		System.out.println("Sem2");
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
class Sem3 extends sem2
{
	int dm,ppl,Python;
	public void input3()
	{
		dm=55;
		ppl=88;
		Python=65;
	}
	public void output3()
	{
		System.out.println("Results of Smester-3 \n\n");
		System.out.println("Marks in DM  "+dm);
		System.out.println("Marks in PPL "+ppl);
		System.out.println("Marks in Python  "+Python);
		System.out.println("-------------------\n\n");
	}
}

public class Multipleinheritance 
{
	public static void main(String[] args) 
	{
		Sem3 obj=new Sem3();
		
		obj.input();
		obj.input2();
		obj.input3();
		obj.output();
		obj.output2();
		obj.output3();
	}
}


