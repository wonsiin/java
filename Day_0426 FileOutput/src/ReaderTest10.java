import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("score.txt"));
		String str;
		
		
		while(true) {
			
		str = br.readLine(); //���ڿ��� ��ä�� �о String(���ڿ�)(��)�� ��������ش�.
		if(str == null) break;
		
		//split���� ����(�ɰ���), 0: �̸�, 1:����, 2 : ����, 3: ����
		//�հ����
		String[] a = str.split(" ");
		String il = a[0];
		int kor = Integer.parseInt(a[1]);
		int su = Integer.parseInt(a[2]);
		int eng = Integer.parseInt(a[3]);
		int total = kor + su + eng;
		double avg = total / 3.0;
		System.out.println("�̸� : " + il + "\n���� : " + kor + " ���� : " +su+ " ���� : " +eng + " �հ� : " +total+ " ��� : " +avg);
		}
		br.close();
	}

}
