
import java.util.Scanner;

public class FitnessMain {

	public static void main(String[] args) {
		int count = 0;

		FitnessVO[] member = new FitnessVO[5];
		Scanner sc = new Scanner(System.in);
		
		//����
		//---------------------------
		
		for(int i =0; i < count; ++i) {}
		member[count++] = new FitnessVO("1","ȫ�浿",180,95);// ��ü�� ���� �ְ� ī���� 1����
		member[count++] = new FitnessVO("2","ȫ��",160,60);
		member[count++] = new FitnessVO("3","ȫ��",195,80);
		member[count++] = new FitnessVO("4","�浿",170,50);
		member[count++] = new FitnessVO("5","��ȫ",145,90);
		
		
		//ȸ�� �˻�
		String id = "1";
		int no = -1;
		
		for(int i=0; i<count; ++i) {
			if(member[i].getUsrId().equals(id)) {
				no = i;
				break;
			}
		}
		System.out.println("## �˻��� ȸ������");
		if(no == -1)
			System.out.println("ȸ���� �����ϴ�.");//���ȣ ���� if�� ����� �����ϴ�.
		else
			member[no].output();
		
		
		
//		for(int i=0;i < count;++i) {
//			if(id == member[i].getUsrId()) {
//				member[i].output();
//			}else {
//				System.out.println("������ �ٸ��ϴ�.");
//			}
//		}
		//�к��� ���
		for(int i=0; i < count;++i) { //count�� �ؾ� ���� ���ϰ� ó���Ҽ��ִ�.
			if(member[i] != null) {
				member[i].output();
			}	
		}
		
		//����
		
		id = "2"; //������ ȸ��id
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
		
		
		//ȸ������
		
		id = "3"; //Ż���� ȸ��id
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
		
		//��� ȸ�� ������ ���
		for(int i=0; i < count;++i) { //count�� �ؾ� ���� ���ϰ� ó���Ҽ��ִ�.
			if(member[i] != null) {
				member[i].output();
			}	
		}
	}


}
