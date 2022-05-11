
public class ForTest2 {

	public static void main(String[] args) {
		int b=0;
		
		for(int i=1;i <= 100;++i) { 
			b = b + i;
		}
		System.out.printf("100까지의 누적합 : %d",b);
	}

}
