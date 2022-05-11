import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		Student s1 = new Student("홍길동",21);
		Student s2 = new Student("저팔게",22);
		Student s3 = new Student("저팔게",22);
		
		System.out.println(s2);
		System.out.println(s3);
		//String 은 상수 full 에 저장이 들어가서 중복으로 걸러진 것이고 여기는 new를 진행하여 새로 만든것이다.
		//Object로 부터 상속받은 메소드인 equals()를 오버라이딩 해야한다.
//		s2.equals(s3); 2와 3이 같은지 확인하는방법
		System.out.println("같은 데이터 인가요 ? = " + s2.equals(s3));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
//		set.add(new Student("홍길동",21));
//		set.add(new Student("저팔게",22));
//		set.add(new Student("저팔게",22));
//		//
//		
		
	}

}
