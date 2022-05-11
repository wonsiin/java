import java.util.Scanner;

public class InputTest1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
		String name;
		int age;
		
		
		System.out.println("이름 : ");
		name = keyin.next(); //next()하나의 단어만 입력가능
		
		keyin.nextLine();
		
		System.out.println("나이 : ");
		age = keyin.nextInt();
		
		System.out.printf("당신의 이름은 : %s%n나이 : %d",name,age);
		
		
	}

}
/*
	next() : 하나의 문자열단어를 입력 받는다. WS(화이트스페이스)(space, tab, enter)
	nextLine() : 문장을 입력받는다. 앤터를 친 위치까지 하나의 문장으로 인식.
				stdin을 비우는 역활도 수행.
*/