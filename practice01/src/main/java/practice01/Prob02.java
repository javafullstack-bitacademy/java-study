package practice01;


public class Prob02 {

	public static void main(String[] args) {
		for( int i = 1; i <= 9; i++ ) {
			for( int j = i; j < i + 10; j++ ) {
				System.out.print( j + " " );
			}
			System.out.print( "\n" );
		}
	}

}
