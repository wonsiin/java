package pro3.two.value;

public class Pt_VO {
	private String name;
	private String jon;
	private int nai;
	
	public Pt_VO() {}
	
	public Pt_VO(String name, String jon, int nai) {
		this.name = name;
		this.jon = jon;
		this.nai = nai;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJon() {
		return jon;
	}
	public void setJon(String jon) {
		this.jon = jon;
	}
	public int getNai() {
		return nai;
	}
	public void setNai(int nai) {
		this.nai = nai;
	}

	@Override
	public String toString() {
		return "name=" + name + ", jon=" + jon + ", nai=" + nai;
	}
	
	
	
}
