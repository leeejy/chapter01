package chapter01;

public class NumberTriangle {

	public static void main(String[] args) {
		if(args.length == 0) return;
		
		int number=Integer.parseInt(args[0]);
		
		for(int i=0;i<number;i++){
			for(int j=0;j<=i;j++)
				System.out.print(i+1);
			System.out.println();
		}

	}

}
