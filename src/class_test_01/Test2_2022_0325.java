package class_test_01;

import java.util.Scanner;

public class Test2_2022_0325 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է� :");
		
		int math = scann.nextInt();
		int science = scann.nextInt();
		int english = scann.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("����� "+me.average());
		
		scann.close();
		
	}

}
