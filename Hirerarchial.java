package javalab;
import java.util.Scanner;
class Employee
{
	 String name;
	 int age;
	 long number;
	 String address;
	 float sallary;
	 Employee(String name1,int age1,long number1,String address1,float sallary1)
	 {
		 name = name1;
		 age = age1;
		 number = number1;
		 address = address1;
		 sallary = sallary1;
	 }
	 void printemployee()
	 {
		 System.out.println("name"+name);
		 System.out.println("age"+age);
		 System.out.println("number"+number);
		 System.out.println("address"+address);
		 //System.out.println("sallary"+sallary);
	 }
	 void printsallary()
	 {
		 System.out.println("sallary="+sallary);
	 }
}
   class Officer extends Employee
 {
	String specialization;
	Officer(String name1,int age1,long number1,String address1,float sallary1,String specialization1)
	{
		super(name1,age1,number1,address1,sallary1);
		specialization=specialization1;
	}
	void printspecialization()
	{
		System.out.println("specialization="+specialization);
	}	 
 }
   class Manager extends Employee
   {
	   String department;
	   Manager(String name1,int age1,long number1,String address1,float sallary1,String department1)
	   {
		   super(name1,age1,number1,address1,sallary1);
		   department=department1;
	   }
	   void printdepartment()
	   {
		   System.out.println("department="+department);
	   }
	   
   }
public class Hirerarchial {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	int age;
	long number;
	String address;
	float sallary;
	String specialization;
	String department;
	System.out.println("enter the officer name");
	name=sc.next();
	System.out.println("enter the officer age");
	age=sc.nextInt();
	System.out.println("enter then number");
	number=sc.nextLong();
	System.out.println("enter the officer address");
	address=sc.next();
	System.out.println("enter the officer sallary");
	sallary=sc.nextFloat();
	System.out.println("enter specialization");
	specialization=sc.next();
	Officer o=new Officer(name,age,number,address,sallary,specialization);
	o.printemployee();
	o.printsallary();
	o.printspecialization();
	System.out.println("enter the manager name");
	 name=sc.next();
	System.out.println("enter manager age");
	 age=sc.nextInt();
	System.out.println("enter manager number");
	number=sc.nextLong();
	System.out.println("enter manager address");
	 address=sc.next();
	System.out.println("enter manager sallary");
	 sallary=sc.nextFloat();
	System.out.println("enter department");
	department=sc.next();
	Manager m=new Manager(name,age,number,address,sallary,department);
	m.printemployee();
	m.printsallary();
	m.printdepartment();
	
	}

}
