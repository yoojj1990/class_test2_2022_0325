package class_test_01;

import java.util.Scanner;

public class Main_test_01 {

	public static void main(String[] args) {
		
		Book book_array[] = new Book[5];
		
		Scanner scann = new Scanner(System.in);
		
		for(int i = 0; i < book_array.length; i++) {
			
			System.out.print("제목 : ");
			String title = scann.nextLine();
			System.out.print("저자 : ");
			String author = scann.nextLine();
			
			book_array[i] = new Book(title, author);
			
		}
		
		String a = book_array[3].author;
		String b = book_array[3].title;
		
		System.out.println(a);
		System.out.println(b);
		
		scann.close();
	}

}
