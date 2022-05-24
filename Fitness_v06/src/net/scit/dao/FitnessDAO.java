package net.scit.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import net.scit.vo.FitnessVO;

public class FitnessDAO {
	
	public int regist(FitnessVO vo) {
		boolean result = list.add(vo);
		if(result) return 1;
		
		return 0;
	}
	public FitnessVO findById(String userid) {
		FitnessVO fitnessvo = null;
		
		for(FitnessVO temp : list ) {
			if(temp.getUsrId().equals(userid)) {
				fitnessvo = temp;
				break;
			}
		}
		return fitnessvo;
	}
	public List<FitnessVO> findAll() {
		
		list.sort(new Comparator<FitnessVO>() {

			public int compare(FitnessVO o1, FitnessVO o2) {
				return o1.getUserName().compareTo(o2.getUserName());
			}
		});
		list.forEach(x -> System.out.println(x + " "));
		return list;
	}

	public int delete(String userid) {
		boolean result = list.removeIf(x -> x.getUsrId().equals(userid));
		
		return 0;
	}

	public int update(FitnessVO vo) {
		int no = searchPositionOfFitnessMember(vo.getUsrId());
		list.removeIf(x -> (no != -1));
		list.set(no, vo);
		return 1;
	}

	private int searchPositionOfFitnessMember(String userid) {
		for(int i=0; i<list.size(); ++i) {
			if(list.get(i).getUsrId().equals(userid))
				return i;
		}
		return -1;
	}
	

}
