package enumtest;

enum Season{
	봄,여름,가을,겨울;
//	봄("Spring"),여름("Summer"),가을("Fall"),겨울("Winter");
}

class Product{
	String id;
	Season season;
	public Product(String id, Season season) {
		super();
		this.id = id;
		this.season = season;
	}
}

public class EnumTest1 {

	public static void main(String[] args) {
		Season s = Season.가을;
		System.out.println(s);
		Product p1 = new Product("a001", Season.봄);
		System.out.println(p1);
	}

}
