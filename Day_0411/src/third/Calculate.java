package third;

public interface Calculate {
	double PI = 3.14; //자동으로 public static final이 자동으로 붙는다. 초기화 안시키면 오류가 생김
	double A = 0.5;
	public double area();
	public void print();
}
