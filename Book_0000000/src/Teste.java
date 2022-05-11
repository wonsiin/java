import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("½Ò ¸î°³? : ");
		n = sc.nextInt();
		sc.nextLine();
		if(1<= n && n <= 20) {
			n = n * 150;
		}
		System.out.println(n+"g");
	}
}
