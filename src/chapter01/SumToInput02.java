package chapter01;

public class SumToInput02 {

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("usage: java SumToInput02 [number]");
			return;
		}
		//String -> Integer ( args[0] = String )
		int number = Integer.parseInt(args[0]); 
		
		int n = 10;
		String s = "" + n;
		String s1 = String.valueOf(n);
		System.out.println(s+s1);
		
		int sum = 0;
		for (int i = 0; i <= number; i++)
			sum += i;
		System.out.println(sum);
	}
}
