import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		String name;
		String address;
		int age;
		double ki;
		
		System.out.print("�̸��� �Է��� �ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		name = scanner.nextLine();
		
		System.out.println("���̸� �Է����ּ��� : ");
		age = scanner.nextInt();
		
		System.out.print("�ּҸ� �Է��� �ּ��� : ");
		Scanner scanner1 = new Scanner(System.in);
		address = scanner1.nextLine();
		
		System.out.print("Ű�� �Է��� �ּ��� : ");
		Scanner scanner2 = new Scanner(System.in);
		ki = scanner2.nextDouble();
		
		System.out.printf("�̸� : %s%n�ּ� : %s%n���� : %d%nŰ : %.1f%n",name,address,age,ki);
	}

}
