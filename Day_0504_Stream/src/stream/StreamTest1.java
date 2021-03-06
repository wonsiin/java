package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest1 {
	public static void main(String[] args) {
		//1 ) List를 이용하여 스크림을 생성
		List<Integer> ilist = Arrays.asList(5,3,2,1,6,7,82,8,41);
		Stream<Integer> istrm = ilist.stream();
		
		//연산을 마무리
		istrm.forEach(x -> System.err.print(x + " "));
//		istrm.forEach(x -> System.err.print(x + " "));	한번 닫히고 나면 이어서 연산이 불가능하다.
		
		//2 ) 문자열 배열을 통한 스트림의 생성
		System.out.println();
		String[] str = {"비행기" ,"병희상","뭐해융" ,"돌굴러","가유"};
		Stream<String> sstrm = Stream.of(str);
		sstrm.forEach(x -> System.out.print(x + " "));
		System.out.println();
		System.out.println("====================================");
		//3 ) 정수형 객체배열을 통한 스트림의 생성
		Integer[] iary1 = {1,3,5,8,2};
//		String temp = "111";				참조형
		Stream<Integer> istrm2 = Arrays.stream(iary1);
//		Stream<Integer> tmp1 = Stream.of(iary1);		오류아님
		long cnt = istrm2.count();						//개수가 많다
//		System.out.println("개수 : " + cnt);				//최종연산 닫혔는데 또 사용하여 에러가 발생
//		istrm2.forEach(x -> System.out.print(x + " "));
//		int total = istrm2.sum();						//객체형 변수는 sum을 사용할수 없다.
		
		//Stream<Integer> 에서는 합계못구하고 IntStream istrm3 에서 합계를 구할수 있다.
		System.out.println();
		System.out.println("====================================");

		//4 ) 정수형 기본 자료형 배열을 통한 스트림의 생성
		int[] iary2 = {1,3,5,8,2};
		Arrays.stream(iary2);
		IntStream istrm3 = Arrays.stream(iary2);
		
		int total = istrm3.sum();
		System.out.println(total); //합계
		
		IntStream istrm4 = Arrays.stream(iary2);
		int co = (int) istrm4.count();
		System.out.println(co);
		
		IntStream istrm5 = Arrays.stream(iary2);
		OptionalDouble pu = istrm5.average();
		System.out.println(pu);
		
		
//		IntStream tmp2 = Stream.of(iary2);				오류
//		istrm3.forEach(x -> System.out.print(x + " "));
		//같은 소스인데 
	}

}
