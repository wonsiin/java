package objectoutput;

import java.io.Serializable;

public class Student implements Serializable{ 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//���ķ� �����ϱ����� implements�Ѵ�
	String name;
	int age;
	public Student(String name, int age) {

		this.name = name;
		this.age = age;
	}
	public Student() {}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	
	
}
