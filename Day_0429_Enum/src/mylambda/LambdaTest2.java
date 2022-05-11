package mylambda;
@FunctionalInterface
interface Sample2 {
	public int max(int a, int b);
	public default int min(int a, int b) {
		return (a > b) ? b : a;
	};
}

public class LambdaTest2 {
	public static void main(String[] args) {
		Sample2 s2 = (a , b) -> a > b ? a : b;
		System.out.println(s2.min(55, 30));
		System.out.println(s2.max(55, 13));
		
	}	

}
