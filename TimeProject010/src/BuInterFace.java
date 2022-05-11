import java.util.List;


public interface BuInterFace {
	public int regist(BuUI bu1);
	
	public int regist1(BuJun bj);
	
	public int regist2(BuWa bw);

    public List<BuUI> selectAll();
    
    public List<BuJun> selectAll1();
    
    public List<BuWa> selectAll2();

    public int delete(String ju);
    
    public BuUI selectOne();
    
    public BuJun selectOne1();
    
    public BuWa selectOne2();

    public int update(BuUI bu1);
    
    public int update(BuJun bj);
    
    public int update(BuWa bw);
    
    
}
