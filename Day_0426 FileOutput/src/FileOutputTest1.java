import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) throws IOException{
		byte[] by = {97,98,100,105,32,123};
		
		FileOutputStream fos = new FileOutputStream("a.txt", true); //true�� ������ data�� �߰��Ѵ�. �����͸� ������ ���� ��� ��ȣ
		fos.write(by);
		
		if(fos != null) fos.close();
		System.out.println("��");
		
	}

}
