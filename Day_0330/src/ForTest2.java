
public class ForTest2 {

	public static void main(String[] args) {
//		System.out.println("������մ��� �����ϼ˴�. \"���������� �߱��� �ٸ���.\""); //"�� �ϳ��� ����ó�� ������ ���ؼ� \ �� ���
//		System.out.println("����ȭ\t��\n��\'��\'�����ϴ�.");//\t = tap, \n = ������
//		System.out.printf("%d %d %d %d\n", (int)'\t',(int)'\n',(int)'\r',(int)'\\');

		
		
		for(int i=0; i <= 127; ++i) {
//			System.out.print(i + " : " + (char)i +" ");
			System.out.printf("%3d : %c ",i,(char)i); //����� �ڸ��� Ȯ��
			if(i % 5 == 0) System.out.println();
		}

	}

}
//, i + (char)i, i + (char)i, i + (char)i, i + (char)i 