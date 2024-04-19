package Polymorphism;

public abstract class Shape {

	private String color;
	private float radius;
	private float lb;
	
	public float getRadius() {
		return radius;
	}

	public float getLb() {
		return lb;
	}

	public void setRadius(float radius) { 
		this.radius = radius;
	}

	public void setLb(float lb) {
		this.lb = lb;
	}

	abstract void calculatearea();
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	
	

}
