package class_test_01;

public class Mul {

	
	int x;
	int y;
	int sum;
	
	public void setValue(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	public int calculate() {
		
		sum = x * y;
		
		System.out.print(sum);
		
		return calculate();
	}
	
}
