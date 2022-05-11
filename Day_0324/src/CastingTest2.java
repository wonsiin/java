
public class CastingTest2 {

	public static void main(String[] args) {
		char ch = 'A';
		ch = (char)(ch + 1); //전체를 캐스팅 해야 가능
//		ch = 65;
//		int a = -10;
//		a = -a;
//		
//		System.out.println(a);
		
		System.out.println(ch);
		System.out.println(ch+1); //문자로 처리못하고 정수로 나온다

	}

}
