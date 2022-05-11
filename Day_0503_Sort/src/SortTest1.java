import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortTest1 {

	public static void main(String[] args) {
		List<Integer> ilist = Arrays.asList(72,37,5,1,10,2,55,82,61);
		Collections.sort(ilist);
		System.out.println(ilist); //오름차순
		
		List<String> slist = Arrays.asList("공공","칠빵","으악","빵야","병희상!!");
		Collections.sort(slist, (a,b) -> a.compareTo(b));
		System.out.println(slist);
		
//		Scanner sc = new Scanner(System.in);
//		List<Score> so = new ArrayList<>();
		List<Score> so = Arrays.asList(
				new Score("5","가자미",270),
				new Score("9","호미",220),
				new Score("8","미미",300),
				new Score("2","메기",210),
				new Score("1","넘원",250)
				);
		for(Score s : so) {
			System.out.println(s);
		}
		System.out.println();
		//so내부의 sort타입이 정렬하는데 적합하지 않다.
		//Comparable 인터페이스를 구현해야 sort를 할 수 있다.
		Collections.sort(so);
		for(Score s : so) {
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(so, (a,b) -> b.getTotal() - a.getTotal());
		for(Score s : so) {
			System.out.println(s);
		}
		

	}

}
