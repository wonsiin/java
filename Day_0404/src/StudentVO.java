
public class StudentVO {
	private String id; //연산을 하지 않을경우 String 으로 만드는게 좋다.
	private String name; //맴버 변수(Member Variable), 인스턴스 변수
	private double javaLang;
	private double cLang;
	
	
	//기본생성자
	public StudentVO() {} // 입력하지 않을시 초기값으로 초기화 한다.
	
	
	//오버로드 생성자
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
		return id;	//지역변수가 이름이 같아서 확실히 해야할때 this.id로 활용 그러지 않을경우 id만 적어도 가능.
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
	//추가기능
	public void output() {
		System.out.println(id +":"+name+","+javaLang+","+cLang);
	}
	
}
