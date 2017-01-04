package chapter01;

import java.util.Scanner;

public class NHelloWorld01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Count : ");
		int count = scanner.nextInt();
		
		int i=0;
		while(i<count){
			System.out.println("["+(i+1)+"] Hello World");
			i++;
		}

	}

}
