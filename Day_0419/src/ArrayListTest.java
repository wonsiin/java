import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		 List<String> slist = new ArrayList<String>();
		 System.out.println(slist.size());
		System.out.println(slist);
		
		slist.add("바나나");
		slist.add("사과");
		slist.add("오렌지");
		slist.add("키위");
		slist.add("파인애플");
		slist.add("포도");
		
		System.out.println(slist.get(0)); //꺼낼 위치를 알때사용
//		1)Data 꺼내는 방법 1번째
		for(int i = 0; i < slist.size(); ++i) { 
			System.out.print(slist.get(i) + " ");
		}
		System.out.println();
//		2)for ~ each 문을 이용한 순회 (배열에서 사용) 꺼내는 방법 2번째
		for(String temp : slist)
			System.out.print(temp + " ");
		System.out.println();
//		3)Iterator 객체를 이용한 순회
		Iterator<String> iter = slist.iterator(); // 순회만 전문적으로 한다.  (java.util)
		
		while(iter.hasNext()) { //내가 소비할게 있는지 물어본다
			System.out.print(iter.next() + " ");		//소비할게 있다면 소비를 해라.
		}
		System.out.println();
		
//		System.out.println(slist.size());				//개수 확인
//		System.out.println(slist);//전체 불러오기
//		System.out.println(slist.size());
//		System.out.println(slist);
//		
//		System.out.println(slist.isEmpty());			//
//		System.out.println(slist.contains("사과"));		//들어있는지 확인
//		System.out.println(slist.contains("아메리카노")); 	//들어있는지 확인
//		
//		slist.add("바나나");
//		System.out.println(slist);
//		String temp = slist.remove(2);
//		System.out.println(temp);
//		System.out.println(slist);
//		
//		String temp1 = slist.remove(slist.size()-1); // 맨 끝단 삭제할때 사용
//		System.out.println(temp1);
//		System.out.println(slist);
////		slist.remove(10);
//		
//		boolean result = slist.remove("오렌지"); //해당 값을 찾아서 삭제한다.
//		System.out.println("삭제결과 : " + result);
//		
//		slist.clear(); //전체 파일 삭제할때 사용
//		System.out.println(slist);
		
		
		
		//문자열
//		List<String> slist = new ArrayList<String>();
		//Double형
//		List<Double> dlist = new ArrayList<Double>();
//		List<Number> ni = new ArrayList<Number>(); // 받을게 다 상위호완인 아버지를 대려오면된다.
		
		
//		int [] iary = new int[10];
//		FitnessVO[] fart = new FitnessVO[10]; //이곳은 10개를 지정해줬지만
		
//		List<FitnessVO> list1 = new ArrayList<FitnessVO>(); // 이곳에선 원할때 언제든 넣는다.
//		List<Integer> list2 = new ArrayList<>(); // <>는 넣어도 되고 안넣어도 된다.
//		List<Integer> list3 = new Vector<>();
//		List<Integer> list3 = new ArrayList<>();
		
		
	}

}
