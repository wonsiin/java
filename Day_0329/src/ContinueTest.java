
public class ContinueTest {

	public static void main(String[] args) {
		for(int i=1;i <= 10; ++i) {
			if(i == 5) continue; //if문이 걸리는게 하나라면 중간 생략 가능(5를 생략한다) [조건식과 같이 contiune를 써야한다]
			if(i%2 == 0) continue; //if문이 걸리는게 하나라면 중간 생략 가능(5를 생략한다) [조건식과 같이 contiune를 써야한다]
			System.out.print(i + " ");
		}
	}

}
