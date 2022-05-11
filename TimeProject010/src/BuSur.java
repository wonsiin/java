import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BuSur implements BuInterFace{
	
	Map<String,BuUI> map = new HashMap<>();
	Map<String,BuJun> map1 = new HashMap<>();
	Map<String,BuWa> map2 = new HashMap<>();
	
	Scanner sc = new Scanner(System.in);
	
	Set<BuUI> set = new HashSet<BuUI>();
	Set<BuJun> set1 = new HashSet<BuJun>();
	Set<BuWa> set2 = new HashSet<BuWa>();
	
	List<BuUI> buu = new ArrayList<BuUI>();
	List<BuJun> bzz = new ArrayList<BuJun>();
	List<BuWa> bww = new ArrayList<BuWa>();

	BuUI bu1 = new BuUI();
	BuJun bj = new BuJun();
	BuWa bw = new BuWa();
	
	BuUI bubu;
	BuJun bzbz;
	BuWa bwbw;
	
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
			case 2:print2();	break;
//			case 3:Update();	break;
			case 4:Delete();	break;
			case 5:selecta(); break;
			case 9: System.out.println("감사합니다."); return;
				
			default: System.out.println("잘못 입력하셧습니다."); break;
			}
		}
	}
	public void print2() {
		System.out.println("---------------------------------------------");
		System.out.println("부동산 중계 관리 시스템");
		System.out.println("---------------------------------------------");
		System.out.println("	0 . 	주소로검색					 ");
		System.out.println("	1 . 	매매 물건 검색					 ");
		System.out.println("	2 . 	전세 물건 검색					 ");
		System.out.println("	3 . 	월세 물건 검색 					 ");
		System.out.println("---------------------------------------------");
		System.out.println("메뉴 번호를 선택하세요 ==> ");
		int a = sc.nextInt();
		sc.nextLine();
		switch (a) {
		case 0: 
			System.out.println("주소를 입력해주세요 : ");
			String ju = sc.nextLine();
			
			if(map.containsKey(ju)) {
				for(int i = 0; i < map.size();i++) {
					if(map.containsKey(ju)) {
					System.out.println(buu.get(i));
					}
				}
			}else if(map1.containsKey(ju)) {
				for(int i = 0; i < map1.size();i++) {
					if(map1.containsKey(ju)) {
					System.out.println(buu.get(i));
					}
				}
			}else if(map2.containsKey(ju)) {
				for(int i = 0; i < map2.size();i++) {
					if(map2.containsKey(ju)) {
					System.out.println(buu.get(i));
					}
				}
			}else {
				System.out.println("찾는 정보가 없습니다.");
			}
		case 1:	aa = true;
				bb = true;
				selectOne(); 
				
				break;
		case 2:	aa = true;
				bb = false;
				selectOne(); 
				break;
		case 3:	aa = false;
				bb = false;
				selectOne();
				break;
		default:System.out.println("잘못 입력하셧습니다. ");break;
		}
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
		case 4: return;
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
			
			aa = true;
			bb = true;
			bu1.setA(aa);
			bu1.setB(bb);
			
			bubu = new BuUI(ju,gu,ku,ga);	
			map.put(ju,bubu);
			set.add(bubu);
			regist(bubu);
			System.out.println(buu.size());
			
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
			bj.setA(aa);
			bj.setB(bb);
			
			bzbz = new BuJun(ju,gu,ku,ga);	
			map1.put(ju, bzbz);
			set1.add(bzbz);
			regist1(bzbz);
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
		bw.setA(aa);
		bw.setB(bb);
		
		bwbw = new BuWa(ju,gu,ku,ga);	
		map2.put(ju, bwbw);
		set2.add(bwbw);
		regist2(bwbw);
		}
	};
	
	public void seletAlll(int o) {
		
		switch (o) {
		case 1:break;
		case 2:break;
		case 3:break;
		case 4:break;
		default:System.out.println("잘못 입력하셧습니다.");break;
		}
			if(aa == true && bb == true) {
				selectAll();
			}
		System.out.println(buu.size());
		System.out.println(bzz.size());
		System.out.println(bww.size());
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

//	public String tam(String ju) {
//		String no = null;
//    	for(int i=0; i<buu.size(); ++i) {
//    		if(buu.get(i).getJu().equals(ju)){
//    			return i;
//    		}
//    	}
//    	return no;
//	}
	
	public int Delete() {
		System.out.println("지우실 키 번호를 입력해주세요 : ");
		String t = sc.nextLine();
		delete(t);
		return 0;
	}
	@Override
	public int delete(String ju) {
		map.remove(ju);
		return 0;
	}

	public int update(BuUI book) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int regist(BuUI bu1) {
		boolean result = buu.add(bu1);
        if (result)
            return 1;

        return 0;
	}
	@Override
	public int regist1(BuJun bj) {
		boolean result = bzz.add(bj);
        if (result)
            return 1;

        return 0;
	}
	@Override
	public int regist2(BuWa bw) {
		boolean result = bww.add(bw);
        if (result)
            return 1;

        return 0;
	}
	
	public void selecta() {
		selectAll();
		selectAll1();
		selectAll2();
	}
	
	@Override
	public List<BuUI> selectAll() {
		return buu;
	}
	@Override
	public List<BuJun> selectAll1() {
		return bzz;
	}
	@Override
	public List<BuWa> selectAll2() {
		return bww;
	}
	@Override
	public BuUI selectOne() {
			for(int i = 0; i < map.size();i++) {
				if(map.containsKey(i)) {
				System.out.println(buu.get(i));
				}
			}
			return bu1 ;
		}
	@Override
	public BuJun selectOne1() {
		for(int i = 0; i < map1.size();i++) {
			if(map1.containsKey(i)) {
			System.out.println(bzz.get(i));
			}
		}
		return (BuJun) bzz ;
	}
	@Override
	public BuWa selectOne2() {
		for(int i = 0; i < map2.size();i++) {
			if(map2.containsKey(i)) {
			System.out.println(bww.get(i));
			}
		}
		return (BuWa) bww;
	}
	@Override
	public int update(BuJun bj) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(BuWa bw) {
		// TODO Auto-generated method stub
		return 0;
	}
}
