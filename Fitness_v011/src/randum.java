import java.util.Scanner;

public class randum {
	Scanner sc = new Scanner(System.in);
	private int[] ban = new int[6];
	private int aa;
	
	public randum() {
		print();
		aa = sc.nextInt();
		if (aa == 1) {
			System.out.print("몇번 굴릴것인지 알려주세요. : ");
			aa = sc.nextInt();
		}else if(aa == 2){
			return;
		}else {
			System.out.println("값을 잘못 입력하셧습니다.");
		}
		randum(aa);
	}
	
	private void randum(int aa) {
		int[] ga = new int[6];
		if(aa != 0) {
			for(int a=0;a < aa; ++a) {
				for(int i =0; i < ga.length; i++) {
					ga[i] = (int)(Math.random() * 45)+1;
					for(int j=0;j < i; j++) {
						if(ga[j] == ga[i]) {
							--i;
							break;
						}
					
					}
//					System.out.print(ga[i] + "\t");
				}
				for(int i=0; i <ga.length;i++) {
					
					for(int j =0; j < ga.length;i++) {
						
					}
				}
//				scanf("%5c,c")
				for(int i=0; i<ga.length; i++) {
					System.out.print(ga[i] + "\t");
				}
				
				System.out.println();
			}
			
		}
		
	}

//	public randum(int ban) {}
	
	public void sta() {
		
	}
	public void print() {
		System.out.println("********************************");
		System.out.println("*****    1. 굴 려 보 기 ***********");
		System.out.println("*****    2. 종 료 하 기 ***********");
		System.out.println("********************************");
	}
	public static void main(String[] args) {
		randum r = new randum();
		
	}
}
