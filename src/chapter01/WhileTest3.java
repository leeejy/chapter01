package chapter01;

import java.util.Scanner;

public class WhileTest3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		while (true) {
			System.out.println("숫자입력[0 to Quit]");
			int value = sc.nextInt();

			if (value == 0)
				break;
			sum += value;
		}
		System.out.println(sum);
		sc.close();
	}
}
