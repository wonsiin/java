package net.scit.ui;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import net.scit.entity.Department;
import net.scit.entity.Patient;
import net.scit.service.TreatmentPatientService;
import net.scit.service.TreatmentPatientServiceImpl;

public class TreatmentPatientUI {
	Scanner keyin = new Scanner(System.in);
	TreatmentPatientService service = new TreatmentPatientServiceImpl();
	

	public TreatmentPatientUI() {
		String choice;

		while(true) {
			menu();
			choice = keyin.nextLine();

			switch(choice) {
			case "1" : regist();     		break;
			case "2" : printAll();    		break;
			case "3" : searchPatientById(); break;
			case "4" : searchPatientByName(); break;
			case "0" : 
				service.setFile();
				System.out.println("** 프로그램을 종료합니다.");
				return;
			default : System.out.println("err) 메뉴를 다시 선택하세요");
			}
		}
	}

	// Main Menu
	private void menu() {
		System.out.println("=== [ 입원 환자 관리 프로그램] ===");
		System.out.println("        1. 환자 등록");
		System.out.println("        2. 전체 출력");
		System.out.println("        3. 환자번호로 조회");
		System.out.println("        4. 환자이름으로 조회");
		System.out.println("        0. 종  료");
		System.out.println("---------------------------");
		System.out.print  ("       선택> ");
	}	

	// 환자 번호로 검색
	private void searchPatientById() { //===================================
		System.out.println("### 환자 조회(번호) ###");
		System.out.print("> 환자번호 : "); 
		String id = keyin.nextLine();
		if(service.findByPatientId(id) == null) {
			System.out.println("** 해당 번호의 환자가 없습니다.");
			System.out.println();
			return;
		}
		Patient pa = service.findByPatientId(id);
		System.out.println("** 조회 결과");
		System.out.println("> 환자 번호 : " +pa.getPatientId());
		System.out.println("> 이   름  : " +pa.getName());
		System.out.println("> 나   이  : " +pa.getAge());
		System.out.println();
		
	}
	
	// 환자 이름으로 검색
	private void searchPatientByName() {
		List<Patient> list = service.selectAll();
		System.out.println("### 환자 조회(이름) ###");
		System.out.print("> 환자이름 : "); 
		String name = keyin.nextLine();
		if(service.findByPatientName(name) == null) {
			System.out.println("** 환자가 존재하지 않습니다.");
			return;
		}
		
		System.out.println("\n** 조회 결과");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("   번호     이름    진찰부서     진찰비     입원일      입원비       총진료비");
		System.out.println("--------------------------------------------------------------------");
		//중요
		service.findByPatientName(name).stream().filter(x -> x.getName().equals(name)).forEach(x -> System.out.println(x));
		

		
		
		
		
		System.out.println();
	}
	
	// 입원 환자 전체 정보 출력
	private void printAll() {
		List<Patient> list = service.selectAll();
		System.out.println("                      << 병원 관리 프로그램 >> ");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("   번호     이름    진찰부서     진찰비     입원일      입원비       총진료비");
		System.out.println("--------------------------------------------------------------------");
		int expenses = 0; 			// 총 진찰비 합계
		int hospitalBill=0 ; 		// 총 입원비 합계
		int total = 0;				// 총 진료비 합계
		
		Collections.sort(list,new Comparator<Patient>() { // 아이디로 오름차순
			@Override
			public int compare(Patient o1, Patient o2) {
				return o1.getPatientId().compareTo(o2.getPatientId());
			}
		});
		list.forEach(x -> System.out.println(x));
		
		
		for(int i = 0; i < list.size();++i) {
			expenses += list.get(i).getExpenses();
			hospitalBill += list.get(i).getHospitalBill();
			total += list.get(i).getTotal();
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("* 총 진찰비 : " + expenses);
		System.out.println("* 총 입원비 : " + hospitalBill);
		System.out.println("* 총 진료비 : " + total);
		
		System.out.println();
	}

	// 입원 환자 정보 등록
	private void regist() {
		// 번호, 진료코드, 입원일수, 나이
		String patientId = null; 		// 환자번호 
		String name=null; 				// 이름
		int age=0; 						// 나이
		Department part=null; 			// 진료코드(진료과목)
		int period = 0; 				// 입원 일수
 
		System.out.println("\n### 환자 정보 입력 ###");
		
		System.out.print("> 환자번호 : "); 
		patientId = keyin.nextLine();
		
		
		if(service.findByPatientId(patientId) != null) {
			Patient pa = service.findByPatientId(patientId);
			System.out.println("> 환자이름 : " + pa.getName());
			name = pa.getName();
			System.out.println("> 환자나이 : " + pa.getAge());
			age = pa.getAge();
			System.out.println("> 진료 과목 : "); 
			part = inputPart();
			
			System.out.println("> 입원 일수 : "); 
			period = keyin.nextInt();
			keyin.nextLine();
			
			service.regist(new Patient(patientId,name,age,part,period));
			
		}else if(service.findByPatientId(patientId) == null) {
			System.out.print("> 환자이름 : "); 
			name = keyin.nextLine();
			
			System.out.print("> 환자나이 : "); 
			age = keyin.nextInt();
			keyin.nextLine();
			
			System.out.println("> 진료 과목 : "); 
			part = inputPart();
			
			System.out.println("> 입원 일수 : "); 
			period = keyin.nextInt();
			keyin.nextLine();
			
			service.regist(new Patient(patientId,name,age,part,period));
		}
		// 환자 번호에 해당하는 환자가 있으면 진료과목 입력, 입원일수 입력 
		// 환자 번호에 해당하는 환자가 없으면 이름, 나이 입력받고 등록 후 진료과목 입력, 입원일수 입력 

		System.out.println("** 환자가 등록되었습니다.");
		
	}
	
	// 입원할 진료과목 선택
	private Department inputPart() {
		
		String choice;
//		Department part;

		// 진료과목을 잘못 입력하면 제대로 입력할 때까지 반복적으로 입력받는다.
		while(true) {
			System.out.println(" ** 진료받는 진료과를 선택하세요");
			System.out.print("1) 외과 2) 내과 3) 피부과 4) 소아과 5) 산부인과 6) 비뇨기과 : ");
			choice = keyin.nextLine();
			switch (choice) {
			case "1": return Department.MI;
			case "2": return Department.NI;
			case "3": return Department.SI;
			case "4": return Department.TI;
			case "5": return Department.VI;
			case "6": return Department.WI;

			default: System.out.println("정확한 값을 입력해주세요.");break;
			}
			
			
		}
	}
}
