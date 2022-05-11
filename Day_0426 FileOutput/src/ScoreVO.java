import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class ScoreVO {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	private int total;
	private double avg;
	private int rank;
	public int count;



	
	public ScoreVO() {}
	public ScoreVO(String name,int kor, int mat , int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		calcScore();
		
		
		
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
		calcScore();
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calcScore();
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
		calcScore();
	}
	
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	public int getRank() {
		return rank;
	}
	
	public void calcScore() {
		this.total = kor + eng + mat;
		this.avg = total / 3.0;
		
		
		
		int hp;
		hp = total;
		int[] at = {hp};
		
		++count;
		for(int i = 0; i < at.length;i++) {
			System.out.println(count+" " + at[i]);
			rank = count;
		}
		
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + "\n���� : " + kor + ", ���� : " + eng + ", ���� : " + mat + "\n�������� : "
				+ total + " , ��� : " + avg + " , ��� : " + rank;
	}
	
	
	
	
}
