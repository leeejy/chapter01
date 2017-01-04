package chapter01;

public class ForTest {

	public static void main(String[] args) {
		// 1~10까지 합을 구한다.

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// System.out.println( i );
			sum = sum + i;
		}

		System.out.println(sum);
	}

}
