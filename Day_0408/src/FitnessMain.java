
import java.util.Scanner;

public class FitnessMain {

	public static void main(String[] args) {
		int count = 0;

		FitnessVO[] member = new FitnessVO[5];
		Scanner sc = new Scanner(System.in);
		
		//가입
		//---------------------------
		
		for(int i =0; i < count; ++i) {}
		member[count++] = new FitnessVO("1","홍길동",180,95);// 객체에 값을 넣고 카운터 1증가
		member[count++] = new FitnessVO("2","홍동",160,60);
		member[count++] = new FitnessVO("3","홍길",195,80);
		member[count++] = new FitnessVO("4","길동",170,50);
		member[count++] = new FitnessVO("5","동홍",145,90);
		
		
		//회원 검색
		String id = "1";
		int no = -1;
		
		for(int i=0; i<count; ++i) {
			if(member[i].getUsrId().equals(id)) {
				no = i;
				break;
			}
		}
		System.out.println("## 검색한 회원정보");
		if(no == -1)
			System.out.println("회원이 없습니다.");//대괄호 없이 if문 사용이 가능하다.
		else
			member[no].output();
		
		
		
//		for(int i=0;i < count;++i) {
//			if(id == member[i].getUsrId()) {
//				member[i].output();
//			}else {
//				System.out.println("정보가 다릅니다.");
//			}
//		}
		//분별용 출력
		for(int i=0; i < count;++i) { //count를 해야 접근 안하고 처리할수있다.
			if(member[i] != null) {
				member[i].output();
			}	
		}
		
		//수정
		
		id = "2"; //수정할 회원id
		no = -1;
		double height=195,weight = 75;
		
		for(int i =0;i < count; ++i) {
			if(member[i].getUsrId().equals(id)) {
				no = i;
				break;
			}
		}
		
		for(int i=no; i<count; ++i) {
			if(member[i].getUsrId().equals(id)) {
				member[i].setHeight(150);
				member[i].setWeight(50);
			}
		}
		
//		if(no != -1) {
//			member[no].setHeight(height);
//			member[no].setWeight(weight);
//		}
		
		
		//회원삭제
		
		id = "3"; //탈퇴할 회원id
		no = -1;
		
		for(int i =0;i < count; ++i) {
			if(member[i].getUsrId().equals(id)) {
				no = i;
				break;
			}
		}
		for(int i = no;i < count-1;++i) {
			member[i] = member.clone()[i+1];
		} 
		count--;
		member[count]=null;
		
		//모든 회원 정보를 출력
		for(int i=0; i < count;++i) { //count를 해야 접근 안하고 처리할수있다.
			if(member[i] != null) {
				member[i].output();
			}	
		}
	}


}
