import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest9 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("anysong.txt");	//�д¿�
		FileWriter fw = new FileWriter("songcopy.txt");	//���¿�
		
		int result = 0;
		
		while(true) {
			result = fr.read();
			if(result == -1) break;
			fw.write(result);	//write �� �� ���� �־�����Ѵ�.
		}
		fr.close();
		fw.close(); //close�� �ؾ� �����̵ȴ�.
	}

}
