package chapter01;

import java.util.Scanner;

public class DowhileTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int value = -1; //첫번째 루프 진입을 위해 -1로 초기화ㅏ
		int sum = 0;
		do {
			System.out.print("숫자입력 [0 to Quit] >");
			value = scanner.nextInt();
			sum += value;
		} while (value != 0);
		
//		while(value!=0){
//			System.out.println("숫자입력 [0 to Quit]");
//			value=scanner.nextInt();
//			sum+=value;
//		}
		System.out.println(sum);
		scanner.close();
	}

}


//입출력할때 doWhile많이씀