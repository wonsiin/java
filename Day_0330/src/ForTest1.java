
public class ForTest1 {

	public static void main(String[] args) {

//		for(char i = 65;i < 91; ++i) {
//			System.out.print(i);
//			
//		}
//		System.out.println();
//		
//		for(char i = 97;i < 123; ++i) {
//			System.out.print(i);
//			
//		}
		for(char i = 'A';i < 'z'; ++i) {
			System.out.print(i);
			if(i > 89 && i < 97) {
				System.out.printf(i + 9 + "%n");
			}
			
		}
		

	}

}
