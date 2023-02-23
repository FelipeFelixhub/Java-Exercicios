package util;

public class Calculator {
	
	public  final double PI = 3.141592;
	
	public  double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public  double volume(double radius) {
		return 4.00 * PI * radius * radius * radius / 3.0;
	}
}
