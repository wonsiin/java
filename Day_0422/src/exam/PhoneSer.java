package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PhoneSer {
	String phoneNumber;
	String name;
	int age;
	Map<String,Phone> map = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	Set<Phone> set = new HashSet<Phone>();
	Phone ph = new Phone();
	public PhoneSer() {
		
		int n;
		

		while(true) {
			print();
			System.out.println("�����Ͻ� ��ȣ�� �˷��ּ��� : ");
			n = sc.nextInt();
			sc.nextLine();
				
			switch (n) {
			case 1:input(); break;
			case 2:Selet();	break;
			case 3:seletAll(); break;
			case 0: System.out.println("�����մϴ�."); return;
				
			default: System.out.println("�߸� �Է��ϼ˽��ϴ�."); break;
			}
		}
	}
	
	public void input() {
		String phoneNumber;
		String name;
		int age;
		System.out.println("��ȭ��ȣ�� �Է����ּ��� : ");
		phoneNumber = sc.nextLine();
		System.out.println("�̸��� �Է����ּ��� : ");
		name = sc.nextLine();
		System.out.println("���̸� �Է����ּ��� : ");
		age = sc.nextInt();
		sc.nextLine();
		
		ph.setPhoneNumber(phoneNumber);
		ph.setName(name);
		ph.setAge(age);
		
		Phone p = new Phone(phoneNumber,name,age);
		map.put(phoneNumber, ph);
		set.add(p);
	};
	public void Selet() {
		
		System.out.println("����ȣ�� �Է��� �ּ��� : ");
		String phoneNumber = sc.nextLine();
		System.out.println(map.size());
		for(int i =0;i < map.size();i ++) {
		if(ph.getPhoneNumber().equals(phoneNumber)){
				System.out.println("��ȭ��ȣ : " + ph.getPhoneNumber() + "\n�̸� : " + ph.getName() + " , ���� : " + ph.getAge());
				break;
			}else {
				return;
			}
		}
		return; 
	}
	public void seletAll() {
		Iterator<Phone> iter = set.iterator();
		while(iter.hasNext()) {
			Phone k = iter.next();
			System.out.println("��ȭ��ȣ = " + k.getPhoneNumber() + " , �̸� = " + k.getName() + " , ���� = " + k.getAge());
		}
	}
	public void print() {
		System.out.println("---------------------------------------------");
		System.out.println("	1 . 	��		��					 ");
		System.out.println("	2 . 	��		ȸ					 ");
		System.out.println("	3 . 	��   ü      ��   �� 					 ");
		System.out.println("	0 . 	��		��					 ");
		System.out.println("---------------------------------------------");
	}
}
