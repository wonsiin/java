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
	public int hashCode() {							//2개의 레퍼런스가 하나를 가르키도록 만들어준다.
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)							//s2.equals(s2)
			return true;
		if (obj == null)							//s2.equals(null)
			return false;
		if (getClass() != obj.getClass())			//클래스 명이 같은지 확인하는방법 (Student / net.scit.vo.Student)
			return false;
		Student other = (Student) obj;				//같은 data가 아니면 형변환을 해봐라
		return age == other.age && Objects.equals(name, other.name);	//private가 아니기 때문에 get이 안된다.(age)
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) { //obj가 Student타입인지 물어본다  맞으면 다음 계산
//			
//			Student temp = (Student)obj; //Student로 다운그레이드를 해줘야한다.
//			
//			if(this.name.equals(temp.name) && this.age == temp.age) {//this.name 값이 temp.name과 같은지 확인하는 코드 String은 equals 로  정수는 == 로
//				return true;
//			}; 
//		}
//		return false;
//	}
}
