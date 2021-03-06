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
import net.scit.vo.FitnessVO;

public class FitnessServiceImpl implements FitnessService{
	List<FitnessVO> list = new ArrayList<>();
	
	public FitnessServiceImpl() {
		getFile();
	}
	//파일로 부터 데이터를 읽어옴
	@SuppressWarnings("unchecked")			//경고 처리하지말라는 신호다
	private void getFile() {
		File file = null;					//file객체 생성
		ObjectInputStream ois = null;		//ObjectInputStream 객체 생성
		try {
			file = new File("fitness.dat");		//파일 지정
			if(!file.exists()) return;//파일이 존재하지 않니?
			ois = new ObjectInputStream(new FileInputStream(file)); //ObjectInputStream 이걸로 값을 못가져와서 FileInputStream을 추가적으로 가져온다
			list = (List<FitnessVO>)ois.readObject(); 
			//List타입이라 List로 받는다. [형변환도 해주는데 오류가 걸리면 or연산으로 오류처리한다]
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	//ArrayList의 데이터를 파일로 저장
	public void setFile() {
		File file = null;
		ObjectOutputStream oos = null;
		
		try {
			file = new File("fitness.dat");
			oos = new ObjectOutputStream(new FileOutputStream(file));
			oos.writeObject(list);
			oos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int regist(FitnessVO vo) {
		boolean result = list.add(vo);
		if(result) return 1;
		
		return 0;
	}
	@Override
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
	@Override
	public List<FitnessVO> findAll() {
		
		list.sort(new Comparator<FitnessVO>() {
			@Override
			public int compare(FitnessVO o1, FitnessVO o2) {
				return o1.getUserName().compareTo(o2.getUserName());
			}
		});
		list.forEach(x -> System.out.println(x + " "));
		return list;
	}
	@Override
	public int delete(String userid) {
		boolean result = list.removeIf(x -> x.getUsrId().equals(userid));
		
		return 0;
	}
	@Override
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
