
public class Gugudan {

	public static void main(String[] args) {
		
		for(int i=2;i<=9;++i) {
			System.out.println(i + "´Ü :");
				for(int j=1;j<=9;++j) {
					System.out.print(i + " * " + j + " = " + i*j + "\t");
						if(j % 3 == 0) {
							System.out.println();
						}
					}
				}
		}


}
