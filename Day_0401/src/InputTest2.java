import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		String name;
		String address;
		int age;
		double ki;
		
		System.out.print("이름을 입력해 주세요 : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		
		System.out.println("나이를 입력해주세요 : ");
		age = scanner.nextInt();
		
		System.out.print("주소를 입력해 주세요 : ");
		Scanner scanner1 = new Scanner(System.in);
		address = scanner1.nextLine();
		
		System.out.print("키를 입력해 주세요 : ");
		Scanner scanner2 = new Scanner(System.in);
		ki = scanner2.nextDouble();
		
		System.out.printf("이름 : %s%n주소 : %s%n나이 : %d%n키 : %.1f%n",name,address,age,ki);
	}

}
