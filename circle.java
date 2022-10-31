
public class circle {
	private double radius;
	
	//Constructor
	public circle(double radius) {
		this.radius = radius;
	}
	
	//Getter
	public double getradius() {
		return radius;
	}
	
	//Setter
	public void setradius(double radius) {
		this.radius = radius;
	}
	
	//Functions
	public double areacir() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double pericir() {
		double perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	
	
	//Main
	public static void main(String[] args) {
		circle cir1 = new circle (10.0);
		
		System.out.println("Area: " + cir1.areacir());
		System.out.println("Perimeter: " + cir1.pericir());
		
		cir1.setradius(25.0);
		System.out.println("Area: " + cir1.areacir());
		System.out.println("Perimeter: " + cir1.pericir());
	}
}
