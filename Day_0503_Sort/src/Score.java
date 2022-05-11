import java.io.Serializable;

public class Score implements Serializable, Comparable<Score>{
	private static final long serialVersionUID = 1L;	//Serializable ���� id���� �Ű��ֱ�
	//implements Comparable<Score> �ܺο��� ScoreŸ�Կ� ���� ��ȣ�� ������ �۵�
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
		return "���̵� = " + id + ", �̸� = " + name + ", ���� = " + total;
	}
	@Override
	public int compareTo(Score o) {	//this�� �ִ� �ɹ��� �� �Ŷ� 1���� �־ ����ϴ�.
		return this.name.compareTo(o.getName());
	}
	
	
	

}
