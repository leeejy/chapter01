package chapter01;

import java.util.Scanner;

public class SumToInput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("입력>");

			int number = scanner.nextInt();
			if(number==0)
				break;
			int sum = 0;
			for (int i = 0; i <= number; i++)
				sum += i;
			System.out.println(sum);
		}
		scanner.close();
	}
}
