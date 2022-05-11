import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest9 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("anysong.txt");	//읽는용
		FileWriter fw = new FileWriter("songcopy.txt");	//쓰는용
		
		int result = 0;
		
		while(true) {
			result = fr.read();
			if(result == -1) break;
			fw.write(result);	//write 에 들어갈 값을 넣어줘야한다.
		}
		fr.close();
		fw.close(); //close를 해야 저장이된다.
	}

}
