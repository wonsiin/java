package enumtest;

import enumtest.EnumTest2.Season;

class Friend{
	String name;
	Season faveriteSeason;
	MyColor faveritedColor;
	public Friend(String name, Season faveriteSeason, MyColor faveritedColor) {
		super();
		this.name = name;
		this.faveriteSeason = faveriteSeason;
		this.faveritedColor = faveritedColor;
	}
	
	
}

public class EnumTest3 {
	public static void main(String[] args) {
		Friend f1 = new Friend("È«±æµ¿", Season.Winter, MyColor.»¹°Ï);
		System.out.println("ÀÌ¸§ : " + f1.name);
		System.out.println("°èÀý : " + f1.faveriteSeason);
		System.out.println("»ö±ò : " + f1.faveritedColor);
	}

}
