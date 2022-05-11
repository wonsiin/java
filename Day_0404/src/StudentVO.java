
public class StudentVO {
	private String id; //������ ���� ������� String ���� ����°� ����.
	private String name; //�ɹ� ����(Member Variable), �ν��Ͻ� ����
	private double javaLang;
	private double cLang;
	
	
	//�⺻������
	public StudentVO() {} // �Է����� ������ �ʱⰪ���� �ʱ�ȭ �Ѵ�.
	
	
	//�����ε� ������
	public StudentVO(String id, String name, double javaLang, double cLang) {
		this.id = id;
		this.name = name;
		this.javaLang = javaLang;
		this.cLang = cLang;
	}
	
	//setter / getter
	public void setId(String id){
		this.id = id;
	}
	public String getId() {
		return id;	//���������� �̸��� ���Ƽ� Ȯ���� �ؾ��Ҷ� this.id�� Ȱ�� �׷��� ������� id�� ��� ����.
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setJavaLang(double javaLang){
		this.javaLang = javaLang;
	}
	public double getJavaLang() {
		return javaLang;
	}
	public void setCLang(double cLang){
		this.cLang = cLang;
	}
	public double getCLang() {
		return cLang;
	}
	//�߰����
	public void output() {
		System.out.println(id +":"+name+","+javaLang+","+cLang);
	}
	
}
