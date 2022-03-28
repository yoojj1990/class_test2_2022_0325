package class_test_01;

public class Div {
	
	int x;
	int y;
	double sum;
	
	public void setValue(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public double calculate() {
		
		sum = (double)x / (double)y;
		
		System.out.print(sum);
		
		return sum;
	}
	
}
