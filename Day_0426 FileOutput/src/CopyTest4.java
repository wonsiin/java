import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest4 {

	public static void main(String[] args) throws IOException { //������ �����Ҷ� �̷��� ��밡��
		FileInputStream fis = new FileInputStream("roje.jpeg"); //���� ��������
		FileOutputStream fos = new FileOutputStream("pupu.jpeg"); //���� �����̸�
		
		int result = 0;
		
		while(true) {
			result = fis.read();
			if(result == -1) break;
			
			fos.write(result);
		}
		System.out.println("\n�Ϸ�");
		
		
		
		if(fis != null) fis.close();
		if(fos != null) fis.close();

	}

	}

