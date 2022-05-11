package pro3.tree.value;

public class Un_VO {
	private String name;
	private String geja;
	private int money;
	

	public Un_VO() {}
	public Un_VO (String name ,String geja, int money) {
		this.name = name;
		this.geja = geja;
		this.money = money;
}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeja() {
		return geja;
	}

	public void setGeja(String geja) {
		this.geja = geja;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "";
	}
	
	}

