package Assignment;

public class Rectangle {
	

	public int l;
	public int b;
	public Rectangle() {
		this.l = 0;
		this.b = 0;
	}
	public Rectangle(int l) {
		
		this.l = l;
		this.b=l;
	}
	
	public Rectangle(int l, int b) {
		
		this.l = l;
		this.b = b;
	}
	public double area() {
		return l*b;
	}
	
	

}
