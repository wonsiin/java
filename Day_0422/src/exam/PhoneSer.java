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
			System.out.println("선택하실 번호를 알려주세요 : ");
			n = sc.nextInt();
			sc.nextLine();
				
			switch (n) {
			case 1:input(); break;
			case 2:Selet();	break;
			case 3:seletAll(); break;
			case 0: System.out.println("감사합니다."); return;
				
			default: System.out.println("잘못 입력하셧습니다."); break;
			}
		}
	}
	
	public void input() {
		String phoneNumber;
		String name;
		int age;
		System.out.println("전화번호를 입력해주세요 : ");
		phoneNumber = sc.nextLine();
		System.out.println("이름을 입력해주세요 : ");
		name = sc.nextLine();
		System.out.println("나이를 입력해주세요 : ");
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
		
		System.out.println("폰번호를 입력해 주세요 : ");
		String phoneNumber = sc.nextLine();
		System.out.println(map.size());
		for(int i =0;i < map.size();i ++) {
		if(ph.getPhoneNumber().equals(phoneNumber)){
				System.out.println("전화번호 : " + ph.getPhoneNumber() + "\n이름 : " + ph.getName() + " , 나이 : " + ph.getAge());
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
			System.out.println("전화번호 = " + k.getPhoneNumber() + " , 이름 = " + k.getName() + " , 나이 = " + k.getAge());
		}
	}
	public void print() {
		System.out.println("---------------------------------------------");
		System.out.println("	1 . 	등		록					 ");
		System.out.println("	2 . 	조		회					 ");
		System.out.println("	3 . 	전   체      출   력 					 ");
		System.out.println("	0 . 	종		료					 ");
		System.out.println("---------------------------------------------");
	}
}
