import java.util.Objects;

public class BuUI {//¸Å¸Å
	private String ju;
	private String gu;
	private int ku;
	private int ga;
	private boolean a,b;
	
	public BuUI() {}
	public BuUI(String ju, String gu, int ku, int ga) {
		this.ju = ju;
		this.gu = gu;
		this.ku = ku;
		this.ga = ga;
	}
	public String getJu() {
		return ju;
	}
	public void setJu(String ju) {
		this.ju = ju;
	}
	public String getGu() {
		return gu;
	}
	public void setGu(String gu) {
		this.gu = gu;
	}
	public int getKu() {
		return ku;
	}
	public void setKu(int ku) {
		this.ku = ku;
	}
	public int getGa() {
		return ga;
	}
	public void setGa(int ga) {
		this.ga = ga;
	}
	public boolean isA() {
		return a;
	}
	public void setA(boolean a) {
		this.a = a;
	}
	public boolean isB() {
		return b;
	}
	public void setB(boolean b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "ju=" + ju + ", gu=" + gu + ", ku=" + ku + ", ga=" + ga + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ju);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BuUI other = (BuUI) obj;
		return Objects.equals(ju, other.ju);
	}
	
	
	

}
