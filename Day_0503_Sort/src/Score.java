import java.io.Serializable;

public class Score implements Serializable, Comparable<Score>{
	private static final long serialVersionUID = 1L;	//Serializable 사용시 id값을 매겨주기
	//implements Comparable<Score> 외부에서 Score타입에 대한 신호를 받으면 작동
	private String id;
	private String name;
	private int total;
	public Score() {}
	public Score(String id, String name, int total) {
		this.id = id;
		this.name = name;
		this.total = total;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "아이디 = " + id + ", 이름 = " + name + ", 총점 = " + total;
	}
	@Override
	public int compareTo(Score o) {	//this에 있는 맴버랑 뺄 거라서 1개만 있어도 충분하다.
		return this.name.compareTo(o.getName());
	}
	
	
	

}
