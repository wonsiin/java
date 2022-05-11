import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class BuSur implements BuService{
	
	Map<String,BuUI> map = new HashMap<>();
	Map<String,BuJun> map1 = new HashMap<>();
	Map<String,BuWa> map2 = new HashMap<>();
	Scanner sc = new Scanner(System.in);
	Set<BuUI> set = new HashSet<BuUI>();
	Set<BuJun> set1 = new HashSet<BuJun>();
	Set<BuWa> set2 = new HashSet<BuWa>();
	List<BuUI> buu = new ArrayList<BuUI>();
	List<BuJun> buu1 = new ArrayList<BuJun>();
	List<BuWa> buu2 = new ArrayList<BuWa>();
	BuUI bu1 = new BuUI();
	BuJun bj = new BuJun();
	BuWa bw = new BuWa();
	boolean aa,bb = false;
	
	public BuSur() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			print();
			System.out.println("메뉴 번호를 선택하세요 ==> ");
			int n = sc.nextInt();
			
			if(n < 0 && n > 9) {
				sc.nextLine();
				System.out.println("잘못된 값 입니다.");
			}
			sc.nextLine();
			switch (n) {
			case 1:print1(); break;
//			case 2:Selet();	break;
//			case 3:Update();	break;
//			case 4:Delete();	break;
			case 5:seletAll(); break;
			case 9: System.out.println("감사합니다."); return;
				
			default: System.out.println("잘못 입력하셧습니다."); break;
			}
		}
	}
	public void bu() {
		print1();
	}
	
	public void print1() {
		System.out.println("---------------------------------------------");
		System.out.println("부동산 매물 정보 등록");
		System.out.println("---------------------------------------------");
		System.out.println("	1 . 	매		매					 ");
		System.out.println("	2 . 	전		세					 ");
		System.out.println("	3 . 	월		세					 ");
		System.out.println("	4 . 	상   위      메   뉴 					 ");
		System.out.println("---------------------------------------------");
		System.out.println("메뉴 번호를 선택하세요 ==> ");
		int a = sc.nextInt();
		sc.nextLine();
		switch (a) {
		case 1:	aa = true;
				bb = true;
				Input(aa,bb); 
				
				break;
		case 2:	aa = true;
				bb = false;
				Input(aa,bb); 
				break;
		case 3:	aa = false;
				bb = false;
				Input(aa,bb);
				break;
			
			

		default:System.out.println("잘못 입력하셧습니다. ");break;
		}
	}
	
	
	public void Input(boolean a, boolean b) {
		if(aa == true && bb == true) {
			String ju;
			String gu;
			int ku;
			int ga;
			System.out.println("주소를 입력해주세요 : ");
			ju = sc.nextLine();
			System.out.println("주거형태을 입력해주세요 : ");
			gu = sc.nextLine();
			System.out.println("크기(평)을 입력해주세요 : ");
			ku = sc.nextInt();
			sc.nextLine();
			System.out.println("매매금액을 입력해주세요 : ");
			ga = sc.nextInt();
			sc.nextLine();
			
			bu1.setJu(ju);
			bu1.setGu(gu);
			bu1.setKu(ku);
			bu1.setGa(ga);
			aa = true;
			bb = true;
			bu1.setA(aa);
			bu1.setB(bb);
			
			BuUI bubu = new BuUI(ju,gu,ku,ga);	
			map.put(ju, bu1);
			set.add(bubu);
		}else if(aa == true && bb == false) {
			String ju;
			String gu;
			int ku;
			int ga;
			System.out.println("주소를 입력해주세요 : ");
			ju = sc.nextLine();
			System.out.println("주거형태을 입력해주세요 : ");
			gu = sc.nextLine();
			System.out.println("크기(평)을 입력해주세요 : ");
			ku = sc.nextInt();
			sc.nextLine();
			System.out.println("매매금액을 입력해주세요 : ");
			ga = sc.nextInt();
			sc.nextLine();
			
			aa = true;
			bb = false;
			bu1.setA(aa);
			bu1.setB(bb);
			bj.setJu(ju);
			bj.setGu(gu);
			bj.setKu(ku);
			bj.setGa(ga);
			
			BuJun bzz = new BuJun(ju,gu,ku,ga);	
			map1.put(ju, bj);
			set1.add(bzz);
		}else if(aa == false && bb == false) {
		String ju;
		String gu;
		int ku;
		int ga;
		System.out.println("주소를 입력해주세요 : ");
		ju = sc.nextLine();
		System.out.println("주거형태을 입력해주세요 : ");
		gu = sc.nextLine();
		System.out.println("크기(평)을 입력해주세요 : ");
		ku = sc.nextInt();
		sc.nextLine();
		System.out.println("매매금액을 입력해주세요 : ");
		ga = sc.nextInt();
		sc.nextLine();
		
		aa = false;
		bb = false;
		bu1.setA(aa);
		bu1.setB(bb);
		bu1.setJu(ju);
		bu1.setGu(gu);
		bu1.setKu(ku);
		bu1.setGa(ga);
		
		BuWa bww = new BuWa(ju,gu,ku,ga);	
		map2.put(ju, bw);
		set2.add(bww);
		}
	};
	
	public void seletAll() {
			
		}

	
	
	
	
	
	public void print() {
		System.out.println("---------------------------------------------");
		System.out.println("부동산 중계 관리 시스템");
		System.out.println("---------------------------------------------");
		System.out.println("	1 . 	등		록					 ");
		System.out.println("	2 . 	검		색					 ");
		System.out.println("	3 . 	수		정					 ");
		System.out.println("	4 . 	삭	        제(거래완료)					 ");
		System.out.println("	5 . 	전   체      출   력 					 ");
		System.out.println("	0 . 	종		료					 ");
		System.out.println("---------------------------------------------");
		
	}
	@Override
	public int regist(BuUI buui) {
		if(aa == true && bb == true) {
			boolean result = buu.add(bu1); 	
			if(result) return 1;	
		}else if(aa == true && bb == false) {
			boolean result = buu1.add(bj); 	
			if(result) return 1;
		}else if(aa == false && bb == false) {
			boolean result = buu2.add(bw); 	
			if(result) return 1;
		}
		return 0;
	}
	@Override
	public BuUI selectOn(String ju) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<BuUI> selectAll() {
		return buu;
	}
	@Override
	public int delete(String ju) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(BuUI book) {
		// TODO Auto-generated method stub
		return 0;
	}
}
