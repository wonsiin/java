package fileio;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

public class FileOutputTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		byte[] by = {65,66,67,32,68};
		try {
			fos = new FileOutputStream("a.txt"); //������ ������
			fos.write(by);
			//output ������ ��
			//
			System.out.println("output�۾��Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close(); //close ���ϸ� ������ �������� �ʴ´�.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
