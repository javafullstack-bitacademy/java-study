package practice01;

import java.util.Scanner;

public class Prob01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int number = scanner.nextInt();
		
		System.out.println(number);
		scanner.close();
	}

}
