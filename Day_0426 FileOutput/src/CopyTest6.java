import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest6 {

	public static void main(String[] args) throws IOException, InterruptedException { //������ �����Ҷ� �̷��� ��밡��
		FileInputStream fis = new FileInputStream("roje.jpeg"); //���� ��������
		FileOutputStream fos = new FileOutputStream("pupu2.jpeg"); //���� �����̸�
		
		int result = 0;
		int cnt = 0;
		byte[] by = new byte[1000];
		
		while(true) {
			result = fis.read(by);
			System.out.println(result);
			if(result < by.length) break;
			Thread.sleep(1000);
			fos.write(by);
			cnt++;
		}
		//������ �����ʹ� ���� ���� ������
		fos.write(by, 0, result); // by�� ������ ��� ���� ������ �����Ұ��� ���Ѵ�.
		
		System.out.println("\n�Ϸ� ==>" + cnt);
//		
//		
//		
		if(fis != null) fis.close();
		if(fos != null) fis.close();

	}

	}

