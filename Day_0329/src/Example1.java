import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int end,i = 0; //a,
		
		System.out.print("�������� �Է��� �ּ��� : ");
		Scanner sc = new Scanner(System.in);
		end = sc.nextInt();
			while (i < end) {
				++i;
//				a = i;
				System.out.printf("%d ",i); //a
			}
		System.out.printf("%n");
		
	}

}
/*
<����> ������ �Է� : 5
1 2 3 4 5

*/