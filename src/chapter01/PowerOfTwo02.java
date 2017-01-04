package chapter01;

import java.util.Scanner;

public class PowerOfTwo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("승수 : ");
		int input=scanner.nextInt();
		int i=0;
		int sum=1;
		while(i<input){
			sum*=2;
			i++;
		}

		System.out.println("2의 "+input+"제곱근은 "+sum+"입니다.");	
	}
	

}
