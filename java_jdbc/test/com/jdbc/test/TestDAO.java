package com.jdbc.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jdbc.dao.고객DAO;
import com.jdbc.dao.제품DAO;
import com.jdbc.dao.주문DAO;
import com.jdbc.datasource.DataSource;
import com.jdbc.dto.고객VO;
import com.jdbc.dto.제품VO;
import com.jdbc.dto.주문VO;



public class TestDAO {
	//231221(thu)
	
	private DataSource dataSource;
	private 고객DAO 고객dao = new 고객DAO();
	private 제품DAO 제품dao = new 제품DAO();
	private 주문DAO 주문dao = new 주문DAO();
	
	@Before
	public void init() {
		dataSource = MockDataSource.getInstance();
		고객dao.setDataSource(dataSource);
		제품dao.setDataSource(dataSource);
		주문dao.setDataSource(dataSource);
	}
	
	
	@Test
	public void test고객리스트()throws Exception {
		List<고객VO> 고객리스트 = 고객dao.selectList(); //selectList()메서드로 고객VO객체의 리스트를 가져온다.
		Assert.assertEquals(9, 고객리스트.size()); //고객리스트의 크기가 9인지 Assert.assertEquals를 이용해 검사함.
	}
	
	@Test
	public void test제품리스트() throws Exception { //위와 동일.
		List<제품VO> 제품리스트 = 제품dao.selectList();
		Assert.assertEquals(7, 제품리스트.size());
	}
	
	@Test
	public void test주문리스트() throws Exception {
		List<주문VO> 주문리스트 = 주문dao.selectList(); //위와 동일.
		Assert.assertEquals(10, 주문리스트.size());
	}
}






