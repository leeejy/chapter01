package chapter01;

import java.util.Scanner;

public class PrimeDetect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소수인지 판단할 문자: ");
		int number = scanner.nextInt();
		boolean prime=true;
		
		//판단 알고리즘
		for(int i=2;i<number;i++){
			System.out.println(number+"/"+i+"="+(number%i));
			if(number%i==0) {
				prime=false;
				break;
			}
//			else prime=true;
		}
		
		//출력
		System.out.println(prime);
	}
}
