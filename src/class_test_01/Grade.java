package class_test_01;

public class Grade {
	
	int m;
	int s;
	int e;
	
	double average;
	
	public Grade(int m, int s, int e ) {
		
		this.m = m;
		this.s = s;
		this.e = e;
		
	}
	
	public double average() {
		
		average = (m+s+e) / 3.0;
		
		return average;
	}

}
