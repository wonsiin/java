import java.util.Scanner;

public class ValidationTest {

	public static void main(String[] args) {
		String[] ju = new String[14];
		char[] cj = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		String n="",n1="",n2="",nn="";
		int aaa;
		boolean a = false;
		
		System.out.print("주민등록 번호를 알려주세요 : ");
		for(int i=0; i < ju.length; ++i) {
			ju[i] = sc.nextLine();
			
			if(ju[i].charAt(6) == '-'){
				a = true;
			}else if(ju[i].charAt(6) != '-'){
				System.out.println(" - 위치를 잘못입력 하셧습니다.");
				a = false;
				break;
			}
			
			if(a == true) {
				if(ju[i].length() != 14) {
					System.out.println();
					System.out.println("정확한 주민번호를 입력해주세요.");
				}else {
					
					if(a = true) {
						char[] ccc = new char[14];
						ccc[i] = ju[i].charAt(i);
						System.out.println(ccc[i]);
							if(ccc[i] == ju[i].charAt(i)) {
								char[] hap = new char[14];
								
							}
					}
						if(a == true) {
							n = ju[i].substring(0,2); //년도
							n1 = ju[i].substring(2,4);
							n2 = ju[i].substring(4,6);
							
//								if(ju[i].charAt(2) == 0) {
//									if(ju[i].charAt(3) <= 9)
//									System.out.println(ju[i].charAt(2) + " " + ju[i].charAt(3));
//								}else if(ju[i].charAt(2) == 1) {
//									if(ju[i].charAt(3) <= 2) {
//										System.out.println(ju[i].charAt(2) + " " + ju[i].charAt(3));
//									}
//								}else {
//									System.out.println(n1 + "달이 존재하지 않습니다. ");
//									return;
//								}
							
							
								
						}
						
						if(ju[i].charAt(7) == '1') {	//성별
							nn = "남자";
							n = "19"+n;
						}else if(ju[i].charAt(7) == '2'){
							nn = "여자";
							n = "19"+n;
						}else if(ju[i].charAt(7) == '3') {	//성별
							nn = "남자";
							n = "20"+n;
						}else if(ju[i].charAt(7) == '4'){
							nn = "여자";
							n = "20"+n;
						}else {
							System.out.println("잘못 입력하셧습니다. 다시 실행해주세요.");
							return;
						}
						System.out.println(n+"년 " + n1 +"달 " + n2 + "일생 " + nn + " 입니다.");

				}
				
			}else {
				System.out.println("주민등록 등록에 실패하셧습니다.");
			}
				
			
			
//			System.out.println(ju[i]);
		}
		
		
		if(ju.equals(ju)) {
			
		}

	}
	public static boolean isNumeric(String temp) {
		for(int i =0; i < temp.length(); ++i) {
			if(!(temp.charAt(i) >= '0' && temp.charAt(i) <= '9')) return false;
			}
		return true;
	}

}
