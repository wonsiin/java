package net.scit.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import net.scit.entity.Patient;

public class TreatmentPatientServiceImpl implements TreatmentPatientService {
	// Code Here
	List<Patient> list = new ArrayList<>();
	public TreatmentPatientServiceImpl() {
		getFile();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void getFile() {
		File file = null;
		ObjectInputStream ois = null;
		try {
			file = new File("patient.dat");
			System.out.println(file);
			if(!file.exists()) return;
			ois = new ObjectInputStream(new FileInputStream(file));
			list = (List<Patient>)ois.readObject();
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void setFile() {
		File file = null;
		ObjectOutputStream oos = null;
		
		try {
			file = new File("patient.dat");
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean regist(Patient patient) {
		boolean t = list.add(patient);
		if(t) return true;
		return false;
	}
	@Override
	public Patient findByPatientId(String patientId) {
		Patient pa = null;
		
		for(Patient p : list ) {
			if(p.getPatientId().equals(patientId)) {
				pa = p;
				break;
			}
		}
		return pa;
	}

	@Override
	public List<Patient> findByPatientName(String name) {
		
		for(int i =0;i < list.size(); i ++) {
			if(list.get(i).getName().equals(name)) {
				return list;
			}
		}
		
		return null;
	}

	@Override
	public List<Patient> selectAll() {
		list.sort(new Comparator<Patient>() {
			@Override
			public int compare(Patient o1, Patient o2) {
				return o1.getPatientId().compareTo(o2.getPatientId());
			}
		});
		return list;
	}
	
	
	
//	private int searchPositionOfFitnessMember(String patientId) {
//		for(int i=0; i<list.size(); ++i) {
//			if(list.get(i).getPatientId().equals(patientId))
//				return i;
//		}
//		return -1;
//	}
	
}
