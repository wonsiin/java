import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest8 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("anysong.txt");
		
		int result = 0;
	
		while(true) {
			result = fr.read();	 //byte ���۰� �ƴ� char���۰� ����
			if(result == -1) break;
			System.out.print((char)result);
		}
		
		if(result == -1) fr.close();
		
	}

}
