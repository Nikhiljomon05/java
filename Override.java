package javalab;
import java.util.Scanner;
class Employe
{
	double salary,da,hra,salary1;
	Employe(double salary,double da,double hra)
	{
		this.salary=salary;
		this.da=da;
		this.hra=hra;
	}
	void display
	()
	{
		System.out.println("employe");
	
	}
	void calcsalary()
	{
		salary1=salary+salary*(da/100)+salary*(hra/100);
		System.out.println("gross salary of employe"+salary1);
	}
}
class Engineer extends Employe
{
	Engineer(double salary,double da, double hra)
	{
		super(salary,da,hra);
	}
	void display()
	{
		super.display();
		super.calcsalary();
		System.out.println("engineer...");
	}
	void calcsalary()
	{
		System.out.println("gross salary of engineer="+salary1*2);
	}
}
public class Override {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double salary,da,hra;
		System.out.println("enter basic sallary of the emloyee");
		salary=s.nextDouble();
		System.out.println("enter da% of the employee");
		da=s.nextDouble();
		System.out.println("enter hra of employee");
		hra=s.nextDouble();
		Engineer e=new Engineer(salary,da,hra);
		e.display();
		e.calcsalary();
		
	

	}

}
