package score;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ScoreExam.java를만듬
//score.txt 파일로부터 데이터를 한줄씩 읽어 ScoreVO로 저장
//ArrayList에 저장
//ArrayList를 출력했을대 전체 인원의 점수가 출력
public class ScoreExam {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("score.txt"));
		List<ScoreVO> arr = new ArrayList<ScoreVO>();
		ScoreVO s = new ScoreVO();
		String str ;
		
		while(true) {
			str = br.readLine();
			if(str == null) break;
			String[] jo = str.split(" ");
			String n = jo[0];
			int k = Integer.parseInt(jo[1]);
			int e = Integer.parseInt(jo[2]);
			int m = Integer.parseInt(jo[3]);
			arr.add(new ScoreVO(n,k,e,m));
			
		}
		for(int i =0; i < arr.size(); i ++) {
			
			System.out.println(arr.get(i));
		}
		
		br.close();
		
	}
	
}
