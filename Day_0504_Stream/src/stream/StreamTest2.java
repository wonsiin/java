package stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		IntStream is1 = IntStream.of(5,3,1,4,7,2,62,31,35,72,88,1,31,2);
		
		//중간연산
		is1.distinct().forEach(x -> System.out.print(x + " ")); //distinct : 중복 데이터 삭제
		System.out.println();
		
		IntStream is2 = IntStream.of(5,3,1,4,7,2,62,31,35,72,88,1,31,2);	//위에껀 닫혀버렷기 때문에 새로 만듬
		//    참 또는 거짓 메소드         중복제거      결과값 출력
		is2.filter(x -> x % 2 == 0).distinct().forEach(x -> System.out.print(x + " "));  //짝수만 골라냄
		//내가 홀수 및 짝수만 골라내고싶다(특정 데이터만 뽑고 싶을대 사용) <람다식으로사용> 중간에 중복제거 매소드를 사용할수도 있다.
		System.out.println();
		IntStream is3 = IntStream.of(5,3,1,4,7,2,62,31,35,72,88,1,31,2);
		is3.map(x -> x * 2).forEach(x -> System.out.print(x + " "));
		System.out.println();
		Stream<String> str1 = Stream.of("at","bnsan","saraju","koko","black","holi","shat");		
		str1.map(x -> x.toUpperCase()).forEach(x -> System.out.print(x + " ")); //toUpperCase : 대문자로 변환
		
		//데이터를 무한개 생성
		System.out.println();
		IntStream.iterate(1, x -> x * 2).limit(10).forEach(x -> System.out.print(x + " ")); //2의 배수를 만듬
		System.out.println();
		//Random
		Random rand = new Random();
		IntStream.generate(() -> rand.nextInt(10)).limit(10).forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		//문제 : 1~ 100 까지 난수를 발생. 중복을 제거시키고 짝수만 10개 출력.
		Random rand1 = new Random();
		System.out.println("1번 완성");
		IntStream.generate(() -> rand1.nextInt(100)).filter(x -> x % 2 == 0)
		.distinct().limit(10).forEach(x -> System.out.print(x + " "));
		//===============================================================================
		Random rand2 = new Random();
		System.out.println();
		System.out.println("2번 완성");
		for(int i = 0; i < 5; i ++ ) {
			IntStream.generate(() -> rand2.nextInt(45)).filter(x -> x != 0)
			.distinct().limit(6).forEach(x -> System.out.print(x + " "));
			System.out.println();
		}
		
		
		
		
	}

}
