import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		Student s1 = new Student("ȫ�浿",21);
		Student s2 = new Student("���Ȱ�",22);
		Student s3 = new Student("���Ȱ�",22);
		
		System.out.println(s2);
		System.out.println(s3);
		//String �� ��� full �� ������ ���� �ߺ����� �ɷ��� ���̰� ����� new�� �����Ͽ� ���� ������̴�.
		//Object�� ���� ��ӹ��� �޼ҵ��� equals()�� �������̵� �ؾ��Ѵ�.
//		s2.equals(s3); 2�� 3�� ������ Ȯ���ϴ¹��
		System.out.println("���� ������ �ΰ��� ? = " + s2.equals(s3));
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
//		set.add(new Student("ȫ�浿",21));
//		set.add(new Student("���Ȱ�",22));
//		set.add(new Student("���Ȱ�",22));
//		//
//		
		
	}

}
