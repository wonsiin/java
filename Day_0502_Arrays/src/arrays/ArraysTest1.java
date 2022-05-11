package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest1 {

	public static void main(String[] args) {
		List<String> slist = new ArrayList<>(); //Read 및 수정이 가능.
		slist.add("대한민국");
		slist.add("미국");
		slist.add("일본");
		slist.add("캐나다");
		
		slist.forEach(x -> System.out.println(x)); //x는 list내의 각 요소
		//R만 가능
		List<String> slist2 = Arrays.asList("Korea","Americe","Japan","Canada");//Read 만 가능
		slist2.forEach(x -> System.out.println(x));
		
		List<Integer> ilist = Arrays.asList(5,3,6,8,3,1); //Integer 숫자를 의미 (AutoBoxing이 되기때문에 new Integer가 되는거다)
		
		

	}

}
