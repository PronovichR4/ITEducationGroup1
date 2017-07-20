package examples.abstractclasses;

abstract public class Shape extends Object {
	private String color = "red";
	private String name = "Father Shape";
	protected String accessableByChildren = "Hello from Father"; 
	
	Shape(){
		//System.err.println("Inside Shape constructor");
	}
	
	Shape(String name){
		this.name = name;
		//System.err.println("Inside Shape constructor with param");
	}
	
	
	public String getName() {
		return name;
	}

	abstract public double getArea();

	abstract public double getPerimetr();

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		color = color;
	}
	
	public void print() {
		System.out.println("I'm " + getName() 
				+ " color is " + color
				+ " area is " + getArea() 
				+ " perimeter is " + getPerimetr());
	}
	
	protected void helloFromGrandFather(){
		System.out.println("helloFromGrandFather");
	}
	
	
	
}
