package chapter01;

public class Echo {

	public static void main(String[] args) {
		System.out.println(args);
		System.out.println(args.length);
		for( String arg : args){
			System.out.println(arg);
		}
	}

}
