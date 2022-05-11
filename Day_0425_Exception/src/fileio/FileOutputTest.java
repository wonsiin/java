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
			fos = new FileOutputStream("a.txt"); //파일을 생성함
			fos.write(by);
			//output 열심히 함
			//
			System.out.println("output작업완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close(); //close 안하면 파일이 생성되지 않는다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
