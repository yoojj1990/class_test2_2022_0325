package class_test_01;

import java.util.Scanner;

public class Test3_2022_0325 {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ� :");
		
		int x = scann.nextInt();
		int y = scann.nextInt();
		char c = scann.next().charAt(0);
		
		
		
		if(c=='+') {
			
			Add add = new Add();
			
			add.setValue(x, y);
			add.calculate();
			
		}
		
		else if(c=='-') {
			
			Sub sub = new Sub();
			
			sub.setValue(x, y);
			sub.calculate();
			
		}
		
		else if(c=='*') {
			
			Mul mul = new Mul();
			
			mul.setValue(x, y);
			mul.calculate();
			
		}
		
		else if(c=='/') {
			
			Div div = new Div();
			
			div.setValue(x, y);
			div.calculate();
			
		}
		else {
			
			System.out.print("�߸��� �Է��Դϴ�.");
			
		}
		
		scann.close();
	}

}
