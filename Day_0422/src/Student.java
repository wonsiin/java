import java.util.Objects;

public class Student {
	String name;
	int age;
	
	Student(){}
	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {							//2���� ���۷����� �ϳ��� ����Ű���� ������ش�.
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)							//s2.equals(s2)
			return true;
		if (obj == null)							//s2.equals(null)
			return false;
		if (getClass() != obj.getClass())			//Ŭ���� ���� ������ Ȯ���ϴ¹�� (Student / net.scit.vo.Student)
			return false;
		Student other = (Student) obj;				//���� data�� �ƴϸ� ����ȯ�� �غ���
		return age == other.age && Objects.equals(name, other.name);	//private�� �ƴϱ� ������ get�� �ȵȴ�.(age)
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) { //obj�� StudentŸ������ �����  ������ ���� ���
//			
//			Student temp = (Student)obj; //Student�� �ٿ�׷��̵带 ������Ѵ�.
//			
//			if(this.name.equals(temp.name) && this.age == temp.age) {//this.name ���� temp.name�� ������ Ȯ���ϴ� �ڵ� String�� equals ��  ������ == ��
//				return true;
//			}; 
//		}
//		return false;
//	}
}
