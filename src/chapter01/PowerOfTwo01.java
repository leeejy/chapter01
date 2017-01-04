package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("승수 : ");
		int input=scanner.nextInt();
		int sum=1;
		for(int i=0;i<input;i++){
			sum*=2;
		}
		System.out.println("2의 "+input+"제곱근은 "+sum+"입니다.");	
	}
	

}
