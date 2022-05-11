import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		StudentVO s1 = new StudentVO(); //<생성자를 이용해서> 객체를 메모리에 로드하는 방법(생성방법)
		// s1 = 참조변수       <생성자> : Constructor
		// 개발자가 생성자를 생성하지 않으면 --> JVM이 생성자를 만들어준다.
		
		s1.setId("123");
		s1.setName("홍길동");
		s1.setJavaLang(89);
		s1.setCLang(88);
		
//		s1.id = "123";		//직접접근
//		s1.name = "홍길동";
//		s1.javaLang = 89;
//		s1.cLang = 88;
		s1.output();
		StudentVO s2 = new StudentVO();
		s2.output();
		
		StudentVO s3 = new StudentVO("456","손오공",77.5,86.7);
		s3.output();
//		s2.id = "234";
//		s2.name = "저팔계";
//		s2.javaLang = 99;
//		s2.cLang = 80;
		//접근 지정자가 없이 된것은 파랑색 세모
//		System.out.println(s1); // 참조변수를 그대로 불러오면 그 주소값을 불러옴
//		Scanner sc = new Scanner(System.in);
//		sc.next();
//		
		System.out.println(s1.getId() + " : " + s1.getName() + " , " + s1.getJavaLang() + " , " + s1.getCLang());
//		System.out.println(s2.id + " : " + s2.name + " , " + s2.javaLang + " , " + s2.cLang);
		System.out.println(s3.getId() + " : " + s3.getName() + " , " + s3.getJavaLang() + " , " + s3.getCLang());
		
	}
}
