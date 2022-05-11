package net.scit.service;

import java.util.List;

import net.scit.entity.Patient;

public interface TreatmentPatientService {
	// ���� �б�
	public void getFile();
	// ���� ����
	public void setFile();
	// ȯ�� ���
	public boolean regist(Patient patient);
	// ȯ�ڹ�ȣ�� �˻�
	public Patient findByPatientId(String patientId);
	// ȯ���̸����� �˻�
	public List<Patient> findByPatientName(String name);
	// ��ü ȯ�� ��ȸ 
	public List<Patient> selectAll();
}
