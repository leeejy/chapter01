package chapter01;

public class ContinueTest01 {
	public static void main(String args[]) {
		int i = 0;
		while (i < 10) {
			if (i > 5) {
				i++; // 이 문장이 없으면 무한루프

				continue;
			}
			System.out.println(i);
			i++;
		}

	}
}
