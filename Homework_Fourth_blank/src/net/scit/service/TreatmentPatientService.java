package net.scit.service;

import java.util.List;

import net.scit.entity.Patient;

public interface TreatmentPatientService {
	// 파일 읽기
	public void getFile();
	// 파일 저장
	public void setFile();
	// 환자 등록
	public boolean regist(Patient patient);
	// 환자번호로 검색
	public Patient findByPatientId(String patientId);
	// 환자이름으로 검색
	public List<Patient> findByPatientName(String name);
	// 전체 환자 조회 
	public List<Patient> selectAll();
}
