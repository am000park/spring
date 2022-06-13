package mc.service.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public abstract class AbstractDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Resource(name="dataSource")
	public void setSuperSqlMapConnection(DataSource dataSource) {
		System.out.println(dataSource);
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	/*
	public Object insert(String queryId, Object parameterObject) {
		
	}
	*/
}
