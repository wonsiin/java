

public class StringTest1 {

	public static void main(String[] args) {
		String s1 = "Korea1";				//상수 pool에 저장됨
		String s2 = new String("Korea2"); 	//heap 에 저장이됨
		char[] ch = {'k','o','r','e','a'};	//
		String s3 = new String(ch);
		String s4 = "Korea4";
		String s5 = "";
		int i1 = 5;
		
//		System.out.println(s1 == s2); // ********************** 참조값 주소 비교 
//		System.out.println(s1 == s4);
		
		//================================
		char c = s1.charAt(3); //메소드 호출 (정수값이라서 int로도 받아진다)
		int d = s1.charAt(3);
//		System.out.println(c + " " + d);
//		c = s1.codePointAt(3);
		d = s1.codePointAt(3);
//		System.out.println(c + " " + d);
			String s = new String();
			//=============== concat
			String temp = "서울시".concat(" ").concat("강남구");								//String 과 차이가 없어보인다. 연산자 + 랑 같다
			System.out.println(temp);														//타입이 같은경우 쭉 연결해서 사용할수 있다.
			
			//=============== contains
			System.out.println("문자열 포함여부 : " + temp.contains("동작"));						//해당 문자열에 해당 글자가 있는지 스캔용도		
			System.out.println("문자열 포함여부 : " + temp.contains("강남"));						//변수에 넣어서 유용하게 사용할수 있을것같다.	있으면 true 없으면 false
			
			
			//=============== endsWith
			System.out.println("문자열 끝나는단어 : " + temp.endsWith("구"));						//특정 문자열로 끝나는지 확인할때 사용 		있으면 true 없으면 false
			
			//=============== startsWith
			System.out.println("문자열 시작하는단어 : " + temp.startsWith("서"));					//특정 문자열이 뭐로 시작하는지 알아볼때 		있으면 true 없으면 false
			
			//=============== equals , equalsIgnoreCase
			System.out.println("동일한 단어야? : " + "People".equals("People"));				//동일한 단어인지 확인
			System.out.println("동일한 단어야? : " + "People".equalsIgnoreCase("People"));		//대소문자 관계없이 동일한 단어인지 확인
			
			//=============== isEmpty
			System.out.println("빈 문자열이야? : " + "".isEmpty());								//길이가 0이다
			System.out.println("빈 문자열이야? : " + "hello".isEmpty());						//길이가 0인지 확인 false
			//=============== length																			
			String song = "나리나리 개나리 입에 따다 물고요";										
			System.out.println("문자열 길이 : " + song.length());								//문자열 길이
			
			//=============== replace	
			String rep1 = song.replace("나", "유");											//나 를 유로 바꾼다.
			System.out.println("바뀐 데이터 : " + rep1);										
			System.out.println("특정 문자를 찾아서 변환(원본은 그대로 유지) : " + song);				//원본은 그대로 유지됨
			
			
			//=============== split
			String money = "점심/9000,커피/4500";
			String[] ary1 = money.split("/");												//띄어쓰기 있는곳을 각 문자열로 나눠준다.
			for(int i=0; i< ary1.length;++i) {												
				System.out.println(ary1[i]);
			}
			
			String[] ary = song.split(" ");													//각각에 넣어줄 문자값을 넣어주는역활
			for(int i=0; i< ary.length;++i) {												//띄어쓰기 있는곳을 각 문자열로 나눠준다.
				System.out.println(ary[i]);
			}
			
			
			// ===========   substring
			System.out.println(song.substring(6));											//6 번째부터 뒤에 다 불러옴
			System.out.println(song.substring(6,9));										//6~9번째까지 값을 가져옴
			
			// ===========   indexOf
			System.out.println(song.indexOf('개'));											//특정 문자의 위치값찾기
			System.out.println(song.indexOf('나'));											//첫번째의 값만 가져온다.
			
			
			
		s.concat(s1);

//		s.equalsIgnoreCase(s1);
//		System.out.println(s.equalsIgnoreCase(s1));						//현재 가진 매소드와 값을 비교해서 같으면 true 인것같다.
//		System.out.println(s.equalsIgnoreCase(s5));						//test할땐 문자열이 1칸이라도 있으면 false 텅 비어있으면 true
//		System.out.println("=========================");
//		s.indexOf(c);													//글자가 들어있으면 -1 비어있으면 0
//		System.out.println(s.indexOf(s1));
//		System.out.println(s.indexOf(s2));
//		System.out.println(s.indexOf(s5));
//		System.out.println("=========================");
//		s.isEmpty();													//문자열이 있으면 모두 지우는것같다.		
//		System.out.println(s.isEmpty());
//		System.out.println("=========================");
//		s.length();
//		System.out.println(s.length());
//		System.out.println("=========================");
//		s.replace(c, c);
//		System.out.println(s.replace(c,c));
//		System.out.println("=========================");
//		s.split(s1);
//		System.out.println(s.split(s1));
//		System.out.println("=========================");
//		s.substring(c);
//		System.out.println(s.substring(c));
//		System.out.println("=========================");
//		s.substring(d, d);
//		System.out.println(s.substring(d,d));
		
		
		
		
		

	}

}
