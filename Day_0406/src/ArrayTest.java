
public class ArrayTest {

	public static void main(String[] args) {
		//������ ������ Ÿ������ ������ �����ؼ� ����Ҷ�
		//���α׷��� ���൵�� �迭�� ũ�⸦ ������ �� ����.
		int a = 10;
		int[] ary = new int[10]; //�� 10���� ���� [heap������ ����]   4bite * 10 = 40bite�� ������ ����
		
		int[] ary1 = new int[] {1,2,3,4,5}; //1��° �ʱ�ȭ ��� [new int[]ĭ�� ��������� ������ �ȵȴ�] 4bite * 5 = 20bite
		int[] ary2 = {11,22,33,44,55};		//2��° �ʱ�ȭ ��� [c���� ����ϴ� ���].
		
		double[] dary1 = new double[5]; // 8bite * 5 = 40bite
		String name = "ȫ�浿";
		String[] sary = new String[5];
		String[] sary2 = {"ȫ", "��","��,","��","��"};
		System.out.println("args�� ���� : " + args.length);
		
	
		
		
		int[] iary;
		iary = new int[5]; //���� �� ���� ����
		
		for(int i=0; i<10; ++i) { //i ������ �����Ͽ� i�� 10���� ������ i�� 1�� �������Ѷ�
			ary[i] = i*10;		  //i ���̵Ǹ� i�� * 10�� ����Ͽ� ary[i]�� �־��
		}						  //
		for(int i=0;i<ary.length;++i) { //i ������ ���� �� i���� ary�� ���� ���� ������ i�� 1�� �������Ѷ�.
			System.out.println(ary[i]);
		}

	}

}
