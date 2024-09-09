package javalab;
abstract class Shape
{
	abstract void noofside();
	
}
 class Rectangle extends Shape
 {
	 int side;
	 Rectangle(int side)
	 {
		 this.side=side;
	 }
	 void noofside()
	 {
		 System.out.println("side of the rectangle is"+side);
	 }
 }
 class Triangle extends Shape
 {
	 int side;
	 Triangle(int side)
	 {
		 this.side=side;
	 }
	 void noofside()
	 {
		 System.out.println("the side of the triangle"+side);
	 }
	 
 }
 class Hexagon extends Shape
 {
	 int side;
	 Hexagon(int side)
	 {
		 this.side=side;
	 }
	 void noofside()
	 {
		 System.out.println("the sides of hexagon is "+side);
	 }
 }
 
public class Side {

	public static void main(String[] args) {
		
		Triangle t=new Triangle(3);
		Rectangle r=new Rectangle(4);
		Hexagon h=new Hexagon(6);
		t.noofside();
		r.noofside();
		h.noofside();

	}

}
