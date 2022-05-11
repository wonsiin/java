import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@FunctionalInterface
interface MyInterface{
	public void test();		//함수쪽에서는  매개변수 -> 입력 , 리턴 -> 출력 이라고 보임
}

interface Sample{
	public void sample();
}

public class LambdaTest2 {
	public static void main(String[] args) {
//		MyInterface m1 = () -> System.out.println("람다식 연습"); //정의 입력 (익명개체)
//		m1.test(); //실행 출력
//		Sample m1 = () -> System.out.println("람다식 연습"); //정의 입력 (익명개체)
//		m1.sample(); //실행 출력
//	}
		List<Integer> ilist = new ArrayList<>();
		ilist.add(5);
		ilist.add(51);
		ilist.add(55);
		ilist.add(62);
		ilist.add(52);
		ilist.add(14);
		System.out.println(ilist);
		
		ilist.forEach(x -> System.out.print(x + " "));
//		ilist.removeIf(x -> (x%2 ==0)? true : false);
		ilist.removeIf(x -> (x%2 ==0));
		System.out.println(ilist);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "한국이");
		map.put(2, "병국이");
		map.put(3, "줭궈");
		map.put(4, "만식이");
		map.forEach((k,v) -> System.out.println(k + " , " + v));	//k = 키 , v = 값
		System.out.println(map);
		

}
//java.util.function ==> interface 만 존재 ==> Functional Interface!!
/*
 * Consumer (입 : T 출 : void )
 * Supplier	(입 : () 출 : T )
 * Predicate (입 : T 출 : boolean )
 * Function (입 : T,R 출 : R )		
 * Runnable (입 : () 출 : void )
 * 
 * BiConsumer (입 : T, U 출 : void)
 * BiPredicate(입 : T, U 출 : boolean)
 * BiFunction(입 : T, U, R 출 : R)
 * 
 */
}