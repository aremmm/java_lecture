package com.jdbc.dao;

import java.util.List;

import com.jdbc.dto.VO;

public interface DAO<E extends VO> {
	// DAO<E extends VO>는 VO를 DAO로 묶어 E라는 리스트로 만든다는 뜻.
	//즉, E로 상속받겠다는 것.제네릭으로 만들겠다는 것. 단, VO만 받겠다는 것.
	//231221(thu)
	
	
	List<E> selectList()throws Exception ;
	E selectById(String id)throws Exception;
	void insert(E e)throws Exception;
	void update(E e)throws Exception;
	void delete(String id)throws Exception;
	
}
