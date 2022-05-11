package my_abstract;

public abstract class AbstractVO { //�ڽ� ������ �������ϰ� �������
	private String name;
	private int age;
	public AbstractVO() {}
	public AbstractVO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "AbstractVO [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
