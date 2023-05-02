package Assignment;

public class Triangle {

	int a,b,c;
	
	public double area() {
		
		double peri = a + b + c;
        double s = peri / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
	}
	public int perimeter() {
		return a+b+c;
	}
}
