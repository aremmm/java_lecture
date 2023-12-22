package com.jdbc.service;

import java.util.List;

import com.jdbc.dao.DAO;
import com.jdbc.dao.고객DAO;
import com.jdbc.dto.고객VO;

public class 고객Service implements Service<고객VO> {
	//231222(fri) >제품,주문도 동일함.
	
	private DAO dao = new 고객DAO();
	public void setDAO(DAO dao) {
		this.dao=dao;
	}
	@Override
	public List<고객VO> list()throws Exception {
		List<고객VO>고객리스트 = dao.selectList();
		return 고객리스트;
	}
	@Override
	public 고객VO get(String id)throws Exception {
		고객VO 고객 = (고객VO) (dao.selectById(id));
		return 고객;
	}
	@Override
	public void regist(고객VO e)throws Exception {
		dao.insert(e); //등록
		
	}
	@Override
	public void modify(고객VO e)throws Exception {
		dao.update(e); //수정
		
	}
	@Override
	public void remove(String id)throws Exception {
		dao.delete(id); //삭제
		
	}


}
