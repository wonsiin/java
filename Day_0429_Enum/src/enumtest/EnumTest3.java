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
		Friend f1 = new Friend("ȫ�浿", Season.Winter, MyColor.����);
		System.out.println("�̸� : " + f1.name);
		System.out.println("���� : " + f1.faveriteSeason);
		System.out.println("���� : " + f1.faveritedColor);
	}

}
