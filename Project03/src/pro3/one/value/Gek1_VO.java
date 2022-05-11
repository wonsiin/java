package pro3.one.value;

public class Gek1_VO {
	private String id;
	private int pw;
	private String name;

	
	public Gek1_VO() {}
	public Gek1_VO(String id,int pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "id=" + id + ", pw=" + pw + ", name=" + name;
	}
}
