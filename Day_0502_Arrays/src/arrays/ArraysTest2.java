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
		//�Ϲ����� ������� 5���� �����͸� ����Ʈ�� ����.
		// asList�� �̿��ؼ� �����.
//		List<Friend> list = new ArrayList<>();
//		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("�̸� : ");
//			String name = sc.nextLine();
//			System.out.println("��ȭ��ȣ : ");
//			String phone = sc.nextLine();
//			System.out.println("���� : ");
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
//		List<Integer> ilist = Arrays.asList(7,3,1,8,2,4,9);		//��������
//		Collections.sort(ilist); 			//list���� �����������ش�.
//		System.out.println(ilist);
//		
//		List<Integer> ilist1 = Arrays.asList(7,3,1,8,2,4,9);	//��������
//		Collections.sort(ilist1, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2-o1; //����,���,0 �� ���ü� �ִ�.
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
//		li = Arrays.asList("�ƾ�","����","����","ȫ��","�ڵ�");
//		Collections.sort(li);			//��������
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
		// 4��) ģ�� ��� : �̸� ������ 
		// 4��) ģ�� ��� : ���� ��������

		List<Friend> st1 = new ArrayList<>();
			
			st1.add(new Friend("�߿�","5121",88));
			st1.add(new Friend("�浿","2211",5));
			st1.add(new Friend("ȫ��","6611",11));
			st1.add(new Friend("�̸�","1911",111));
			st1.add(new Friend("��ī","8811",555));
			
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
//		fland2 = Arrays.asList(new Friend("�浿","2211",5));
//		fland2 = Arrays.asList(new Friend("ȫ��","6611",11));
//		fland2 = Arrays.asList(new Friend("�̸�","1911",111));
//		fland2 = Arrays.asList(new Friend("��ī","8811",555));
//		System.out.println(fland2.size());
//		for(int i=0;i<fland2.size();++i) {
//			System.out.println(fland2.get(i));
//		}
		

		
		
		
		
		
		List<Friend> fland3;
		
		fland3 = Arrays.asList(new Friend("�ƾ�1","11111",11));
		fland3 = Arrays.asList(new Friend("�ƾ�1","11111",11));
		fland3 = Arrays.asList(new Friend("�ƾ�1","11111",11));
		fland3 = Arrays.asList(new Friend("�ƾ�1","11111",11));
		fland3 = Arrays.asList(new Friend("�ƾ�1","11111",11));
		
		
//		sort(List<T> list, Comparator<? super T> c) list�� ������ �������ش�.
		//===================================================================================
//		int[] iarr = new int[] {6,3,7,9,1,3,0,5,7,10};
//		int[] iarr2 = iarr;								//���� ����
//		
//		iarr[0] = 100;
//		System.out.println(iarr[0]);
//		
//		System.out.println(iarr2[0]);
//		
//		int[] iarr3 = Arrays.copyOf(iarr, iarr.length); //1��°�� ����������(����) , 2��°�� ��𼭺��� ������ �����Ұ����� ����
//														//���� ����(2���� �迭������ ����ϸ� �ȵȴ�.
//		System.out.println(Arrays.toString(iarr3));
//		
//		System.out.println("�ּ��Է� : " + iarr + ", " + iarr2 + ", " + iarr3 );
//		//=================================================
//		int[] iarr4 = Arrays.copyOf(iarr, 5);
//		int[] iarr5 = Arrays.copyOf(iarr, 15);
//		System.out.println(Arrays.toString(iarr4));
//		System.out.println(Arrays.toString(iarr5));
//		//=================================================
//		int[] iarr6 = new int[10];
//		Arrays.fill(iarr6, 8); // 10���� �迭�� ���� 8�� ä��ٴٴ� �ǹ�
////		Arrays.fill(�迭��, ä�ﰪ);
//		
//		Arrays.setAll(iarr6, (i) -> (int)(Math.random()*100+1)); //iarr6 �� �� ��ĭ ��ĭ���� �������� ä�� �ִ´�.
////		Arrays.setAll(null, null); //���ٽ����� ��� 
//		System.out.println(Arrays.toString(iarr6));
		//============================================================
		//�ζǻ�Ǻ�
//		int[] iarr17 = new int[6];
//		int count=0;
//		System.out.println("����!!");
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
//		Arrays.sort(iarr6); // int a[] �� �ڵ����� ���������� �ȴ�.
//		Comparator<Integer> comp = new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) { //o1 , o2 ������
//				return o1 - o2; 						//�̷������� ������ִ�. ���� ����
//			}
//		};
////		Arrays.sort(iarr6, new Comparator<Integer>() {		//�̷��� ����Ҽ��ִ�.
////			@Override
////			public int compare(Integer o1, Integer o2) { //o1 , o2 ������
////				return o2 - o1;							//�̷������� ������ִ�. ���� ���� ,o2 - o1 : �������� ���� , o1 - o2 : �������� ����
////			}
////		});
//		Integer[] in = {1,3,5,1,2,4,1,6,2,1};
//		Arrays.sort(in,comp); // in : Integer�� ��ü�� ���� �� , comp : Comparator<Integer>�� ���� ������
////		System.out.println(Arrays.toString(null));
//		Arrays.sort(in, (o1 , o2) -> (o2 - o1)); // in : Integer�� ��ü�� ���� �� , ���ٽ����� Ǯ��
//		System.out.println(Arrays.toString(in));
//		//���ٽ� Comparator : ���Ҷ� ���
	}


}
