import java.util.Scanner;

public class ValidationTest {

	public static void main(String[] args) {
		String[] ju = new String[14];
		char[] cj = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		String n="",n1="",n2="",nn="";
		int aaa;
		boolean a = false;
		
		System.out.print("�ֹε�� ��ȣ�� �˷��ּ��� : ");
		for(int i=0; i < ju.length; ++i) {
			ju[i] = sc.nextLine();
			
			if(ju[i].charAt(6) == '-'){
				a = true;
			}else if(ju[i].charAt(6) != '-'){
				System.out.println(" - ��ġ�� �߸��Է� �ϼ˽��ϴ�.");
				a = false;
				break;
			}
			
			if(a == true) {
				if(ju[i].length() != 14) {
					System.out.println();
					System.out.println("��Ȯ�� �ֹι�ȣ�� �Է����ּ���.");
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
							n = ju[i].substring(0,2); //�⵵
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
//									System.out.println(n1 + "���� �������� �ʽ��ϴ�. ");
//									return;
//								}
							
							
								
						}
						
						if(ju[i].charAt(7) == '1') {	//����
							nn = "����";
							n = "19"+n;
						}else if(ju[i].charAt(7) == '2'){
							nn = "����";
							n = "19"+n;
						}else if(ju[i].charAt(7) == '3') {	//����
							nn = "����";
							n = "20"+n;
						}else if(ju[i].charAt(7) == '4'){
							nn = "����";
							n = "20"+n;
						}else {
							System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �������ּ���.");
							return;
						}
						System.out.println(n+"�� " + n1 +"�� " + n2 + "�ϻ� " + nn + " �Դϴ�.");

				}
				
			}else {
				System.out.println("�ֹε�� ��Ͽ� �����ϼ˽��ϴ�.");
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
