package class_test_01;

import java.util.Scanner;

public class Test2_2022_0325 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 :");
		
		int math = scann.nextInt();
		int science = scann.nextInt();
		int english = scann.nextInt();
		
		Grade me = new Grade(math, science, english);
		
		System.out.println("평균은 "+me.average());
		
		scann.close();
		
	}

}
