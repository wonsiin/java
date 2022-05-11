import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest8 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("anysong.txt");
		
		int result = 0;
	
		while(true) {
			result = fr.read();	 //byte 버퍼가 아닌 char버퍼가 존재
			if(result == -1) break;
			System.out.print((char)result);
		}
		
		if(result == -1) fr.close();
		
	}

}
