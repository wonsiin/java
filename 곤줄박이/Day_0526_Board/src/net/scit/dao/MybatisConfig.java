package net.scit.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisConfig {

	private static SqlSessionFactory sqlSessionFactory;

	static {
		String resource = "mybatis-config.xml";

		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 외부에서 세션이 필요하다고 하면 public 세션을 만들어줌.
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}
