
public class MultLoopTest2 {

	public static void main(String[] args) {

	for(int i = 1; i <= 5; ++i) {
		
			for(int j=5-i; j >= 0; --j) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;++j) {
				System.out.print("*");
			}
			System.out.println();
	}
	System.out.println();

		//¿ª»ï°¢Çü
		for(int i =5; i>= 1; --i) {
			for(int j=1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =1; i<= 5; ++i) {
			for(int j=1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
