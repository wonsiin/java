import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("a.txt");

		int result = 0;
		while(true) {


			result = fis.read();	//���� 1���� �а� -- > �ڵ尪���� return �Ѵ�.
			if(result == -1) break;
			System.out.print((char)result);		//���� data�� ��� -1�� ���
			Thread.sleep(500);
		}
		
		
		
	}

}
