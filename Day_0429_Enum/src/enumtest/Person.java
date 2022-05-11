package enumtest;

public enum Person {
	
	손오공("원숭이"){
		public String work() {
			return "나쁜 놈들을 잡는다. 몽키 같다.";
		}
	},사오정("괴수"){
		public String work() {
			return "나방을 뿜는다. 고라파덕 같다.";
		}
	},저팔계("돼지"){
		public String work() {
			return "뚱뚱하다. 잠만보같다.";
		}
	},삼장법사("인간"){
		public String work() {
			return "지우다. 포켓몬과 친하다.";
		}
	},전우치("나그네");
	
	private String tmp; //선언된 enum보다 아래에 둬야 한다.

	private Person(String tmp) {
		this.tmp = tmp;
	}
	public String getTmp() {	//특징으로 적은 원숭이,괴수 같은게 리턴된다.
		return tmp;
	}
	public String work() {
		return "백수";
	}
	
}
