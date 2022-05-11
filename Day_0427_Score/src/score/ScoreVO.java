package score;

public class ScoreVO {
	private String name;
	private int kor;
	private int mat;
	private int eng;
	private int total;
	private double avg;
	private int rank;



	
	public ScoreVO() {}
	public ScoreVO(String name,int kor, int mat , int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.rank = 1;
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
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void calcScore() {
		this.total = kor + eng + mat;
		this.avg = total / 3.0;
	}
	
	@Override
	public String toString() {
		String temp = String.format("%5s %3d %3d %3d %3d %7.2f %2d", name,kor, eng, mat, total, avg, rank);
		return temp;
	}
	
	
	
	
}
