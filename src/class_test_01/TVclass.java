package class_test_01;

public class TVclass {
	
	String brend;
	int year;
	int inch;
	
	
	public TVclass(String brend, int year, int inch) {
		
		this.brend = brend;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		
		System.out.print(brend+" ���� ���� " +year+ " ���� " +inch+ "��ġ TV");
		
	}
	
	
	
}
