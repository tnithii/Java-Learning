package Polymorphism;

public class Circle extends Shape {
	
	public void calculatearea() {
		float a=3.14f;
		float area=a*getRadius()*getRadius();
		System.out.println(area);
	}

}
