package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraysTest2 {

	public static void main(String[] args) {
		//일반적인 방법으로 5명의 데이터를 리스트로 생성.
		// asList를 이용해서 만든다.
//		List<Friend> list = new ArrayList<>();
//		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("이름 : ");
//			String name = sc.nextLine();
//			System.out.println("전화번호 : ");
//			String phone = sc.nextLine();
//			System.out.println("나이 : ");
//			int age = sc.nextInt();
//			
//			list.add(new Friend(name,phone,age));
//			for(int i = 0; i < list.size(); i++) {
//				System.out.println(list.get(i));
//			}
//			if(sc.nextLine() == "") {
//				break;
//			}
//		}
//		List<Integer> ilist = Arrays.asList(7,3,1,8,2,4,9);		//오름차순
//		Collections.sort(ilist); 			//list값을 오름차순해준다.
//		System.out.println(ilist);
//		
//		List<Integer> ilist1 = Arrays.asList(7,3,1,8,2,4,9);	//내림차순
//		Collections.sort(ilist1, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1; //음수,양수,0 이 나올수 있다.
//			}
//			
//		});			
//		System.out.println(ilist1);
//		
//		List<Integer> ilist2 = Arrays.asList(7,3,1,8,2,4,9);
//		Collections.sort(ilist2, (a,b) -> (b-a));
//		System.out.println(ilist2);
//		
//		List<String> li;
//		li = Arrays.asList("아아","오오","이이","홍길","자두");
//		Collections.sort(li);			//오름차순
//		System.out.println(li);
//		
//		Collections.sort(li, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//			
//		});
		// 4번) 친구 목록 : 이름 순으로 
		// 4번) 친구 목록 : 나이 역순으로

		List<Friend> st1 = new ArrayList<>();
			
			st1.add(new Friend("야옹","5121",88));
			st1.add(new Friend("길동","2211",5));
			st1.add(new Friend("홍야","6611",11));
			st1.add(new Friend("미먕","1911",111));
			st1.add(new Friend("피카","8811",555));
			
			Collections.sort(st1,new Comparator<Friend>() {
				@Override
				public int compare(Friend o1, Friend o2) {
					return o1.getName().compareTo(o2.getName());
				}
			}
			
			);
			
//			List<String> sttt = new ArrayList<>();
			//Collections.sort( xxx , (01,02) -> o1.getName().compareTo(o2.getName())
			System.out.println(st1);
			
			Collections.sort(st1, new Comparator<Friend>() {
				@Override
				public int compare(Friend o1, Friend o2) {
					return o2.getAge() - o1.getAge();
				}
			});
			//Collections.sort( xxx , (01,02) -> o1.getAge().compareTo(o2.getAge())
			System.out.println(st1);

//			System.out.println(st1.size());
//		
//		Arrays.sort(fland2,new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		});
//		for(int i =0;i < fland2.size();++i) {
//			
//			System.out.println(fland2.get(i));
//		}
//		
//		fland2 = Arrays.asList(new Friend("길동","2211",5));
//		fland2 = Arrays.asList(new Friend("홍야","6611",11));
//		fland2 = Arrays.asList(new Friend("미먕","1911",111));
//		fland2 = Arrays.asList(new Friend("피카","8811",555));
//		System.out.println(fland2.size());
//		for(int i=0;i<fland2.size();++i) {
//			System.out.println(fland2.get(i));
//		}
		

		
		
		
		
		
		List<Friend> fland3;
		
		fland3 = Arrays.asList(new Friend("아아1","11111",11));
		fland3 = Arrays.asList(new Friend("아아1","11111",11));
		fland3 = Arrays.asList(new Friend("아아1","11111",11));
		fland3 = Arrays.asList(new Friend("아아1","11111",11));
		fland3 = Arrays.asList(new Friend("아아1","11111",11));
		
		
//		sort(List<T> list, Comparator<? super T> c) list의 값들을 정리해준다.
		//===================================================================================
//		int[] iarr = new int[] {6,3,7,9,1,3,0,5,7,10};
//		int[] iarr2 = iarr;								//얕은 복사
//		
//		iarr[0] = 100;
//		System.out.println(iarr[0]);
//		
//		System.out.println(iarr2[0]);
//		
//		int[] iarr3 = Arrays.copyOf(iarr, iarr.length); //1번째는 오리지날값(원본) , 2번째는 어디서부터 어디까지 복사할것인지 개수
//														//깊은 복사(2차원 배열에서는 사용하면 안된다.
//		System.out.println(Arrays.toString(iarr3));
//		
//		System.out.println("주소입력 : " + iarr + ", " + iarr2 + ", " + iarr3 );
//		//=================================================
//		int[] iarr4 = Arrays.copyOf(iarr, 5);
//		int[] iarr5 = Arrays.copyOf(iarr, 15);
//		System.out.println(Arrays.toString(iarr4));
//		System.out.println(Arrays.toString(iarr5));
//		//=================================================
//		int[] iarr6 = new int[10];
//		Arrays.fill(iarr6, 8); // 10개의 배열을 전부 8로 채우겟다는 의미
////		Arrays.fill(배열값, 채울값);
//		
//		Arrays.setAll(iarr6, (i) -> (int)(Math.random()*100+1)); //iarr6 의 방 한칸 한칸마다 랜덤값을 채워 넣는다.
////		Arrays.setAll(null, null); //람다식으로 사용 
//		System.out.println(Arrays.toString(iarr6));
		//============================================================
		//로또사실분
//		int[] iarr17 = new int[6];
//		int count=0;
//		System.out.println("값은!!");
//		while(true) {
//			Arrays.setAll(iarr17, (i) -> (int)(Math.random()*46+1));
////			if(iarr17.equals(iarr17) == iarr17.equals(iarr17)) {
////				break;
////			}
//			
//			System.out.println(Arrays.toString(iarr17));
//			count++;
//			if(count == 5) {
//				break;
//			}
//		}
//		System.out.println("================");

		
		//============================================================
//		Arrays.sort(iarr6); // int a[] 는 자동으로 오름차순이 된다.
//		Comparator<Integer> comp = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) { //o1 , o2 정수값
//				return o1 - o2; 						//이런식으로 만들수있다. 정순 정렬
//			}
//		};
////		Arrays.sort(iarr6, new Comparator<Integer>() {		//이렇게 사용할수있다.
////			@Override
////			public int compare(Integer o1, Integer o2) { //o1 , o2 정수값
////				return o2 - o1;							//이런식으로 만들수있다. 역순 정렬 ,o2 - o1 : 내림차순 정렬 , o1 - o2 : 오름차순 정렬
////			}
////		});
//		Integer[] in = {1,3,5,1,2,4,1,6,2,1};
//		Arrays.sort(in,comp); // in : Integer의 객체가 들어가야 함 , comp : Comparator<Integer>의 값이 들어가야함
////		System.out.println(Arrays.toString(null));
//		Arrays.sort(in, (o1 , o2) -> (o2 - o1)); // in : Integer의 객체가 들어가야 함 , 람다식으로 풀이
//		System.out.println(Arrays.toString(in));
//		//람다식 Comparator : 비교할때 사용
	}


}
