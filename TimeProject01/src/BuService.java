import java.util.List;

public interface BuService {
	public int regist(BuUI buui);
	
	public BuUI selectOn(String ju);
	
	public List<BuUI> selectAll();
	
	public int delete(String ju);
	
	public int update(BuUI book);
	
}
