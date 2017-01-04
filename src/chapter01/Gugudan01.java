package chapter01;

public class Gugudan01 {

	public static void main(String[] args) {
		int i=1;
		while(i<=9){
			System.out.println(i+"단 시작");
			int j=1;
			while(j<=9)
			{
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			i++;
			System.out.println("\n");
		}

	}

}
