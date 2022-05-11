import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("score.txt"));
		String str;
		
		
		while(true) {
			
		str = br.readLine(); //문자열을 통채로 읽어서 String(문자열)(으)로 저장시켜준다.
		if(str == null) break;
		
		//split으로 분할(쪼갠다), 0: 이름, 1:국어, 2 : 수학, 3: 영어
		//합계평균
		String[] a = str.split(" ");
		String il = a[0];
		int kor = Integer.parseInt(a[1]);
		int su = Integer.parseInt(a[2]);
		int eng = Integer.parseInt(a[3]);
		int total = kor + su + eng;
		double avg = total / 3.0;
		System.out.println("이름 : " + il + "\n국어 : " + kor + " 수학 : " +su+ " 영어 : " +eng + " 합계 : " +total+ " 평균 : " +avg);
		}
		br.close();
	}

}
