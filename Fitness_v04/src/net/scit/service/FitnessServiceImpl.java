package net.scit.service;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import net.scit.vo.FitnessVO;

public class FitnessServiceImpl implements FitnessService{
	List<FitnessVO> list = new ArrayList<>();
	
	public FitnessServiceImpl() {
		getFile();
	}
	
	//���Ϸ� ���� �����͸� �о��
	@SuppressWarnings("unchecked")			//��� ó����������� ��ȣ��
	private void getFile() {
		File file = null;					//file��ü ����
		ObjectInputStream ois = null;		//ObjectInputStream ��ü ����
		
		try {
			file = new File("fitness.dat");		//���� ����

			if(!file.exists()) return;//������ �������� �ʴ�?
			ois = new ObjectInputStream(new FileInputStream(file)); //ObjectInputStream �̰ɷ� ���� �������ͼ� FileInputStream�� �߰������� �����´�
			
			list = (List<FitnessVO>)ois.readObject(); 
			//ListŸ���̶� List�� �޴´�. [����ȯ�� ���ִµ� ������ �ɸ��� or�������� ����ó���Ѵ�]
			
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	//ArrayList�� �����͸� ���Ϸ� ����
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
		return list;
	}
	@Override
	public int delete(String userid) {
		int no = searchPositionOfFitnessMember(userid);
		
		if(no == -1) return 0;
		list.remove(no);
		
		return 1;
	}
	@Override
	public int update(FitnessVO vo) {
		int no = searchPositionOfFitnessMember(vo.getUsrId());
		
		if(no == -1) return 0;
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
