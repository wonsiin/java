package enumtest;

enum Season{
	��,����,����,�ܿ�;
//	��("Spring"),����("Summer"),����("Fall"),�ܿ�("Winter");
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
		Season s = Season.����;
		System.out.println(s);
		Product p1 = new Product("a001", Season.��);
		System.out.println(p1);
	}

}
