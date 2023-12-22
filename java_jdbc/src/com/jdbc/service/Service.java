package com.jdbc.service;

import java.util.List;

import com.jdbc.dto.VO;

public interface Service<E extends VO>{
	//231222(fri)
		
	List<E> list()throws Exception;
	E get(String id)throws Exception;
	void regist(E e)throws Exception; //등록
	void modify(E e)throws Exception; //수정
	void remove(String id)throws Exception; //삭제
	

}
