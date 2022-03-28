package class_test_01;

public class Grade {
	
	private int math;
	private int science;
	private int english;
	
	double average;
	
	public Grade(int math, int science, int english ) {
		
		this.math = math;
		this.science = science;
		this.english = english;
		
	}
	
	public double average() {
		
		average = (math + science + english) / 3.0;
		
		return average;
	}

}
