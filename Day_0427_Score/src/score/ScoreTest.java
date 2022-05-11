package score;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScoreTest {

	public static void main(String[] args) throws IOException {
		List<ScoreVO> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("score.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("score_result.txt"));
		
		String str;
		
		while(true) {
			str = br.readLine();
			if(str == null) break;
			
			String[] score = str.split(" ");
			String name = score[0];
			int kor = Integer.parseInt(score[1]);
			int eng = Integer.parseInt(score[2]);
			int met = Integer.parseInt(score[3]);
			
			list.add(new ScoreVO(name,kor, eng, met)) ;
			
			
			
		}
		printAll(list); //등수 미지정
		makeRank(list);	//등수 지정
		System.out.println("=========================");
		printAll(list);
		
		//파일로 출력하기
		bw.write("====================[성적결과]===============\r\n"); //타이틀 이기에 for문 밖에 둬야한다.
		for(int i = 0; i < list.size(); ++i) {
			String temp = list.get(i).toString();
			bw.write(temp + "\r\n");
		}
		
		
		br.close();
		bw.close();
	}
	public static void printAll(List<ScoreVO> list) {
		Iterator<ScoreVO> iter = list.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	public static void makeRank(List<ScoreVO> list) {
		Iterator<ScoreVO> iter = list.iterator();
		
		for(int i = 0; i <list.size()-1;++i) {
			for(int j = i+1; j < list.size(); ++j) {
				if(list.get(i).getTotal() > list.get(j).getTotal()) {
					int rank = list.get(j).getRank();
					rank++;
					list.get(j).setRank(rank);
				} else if(list.get(i).getTotal() < list.get(j).getTotal()) {
					int rank = list.get(i).getRank();
					rank++;
					list.get(i).setRank(rank);
				}
			}
		}
		printAll(list);
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
	}
}
