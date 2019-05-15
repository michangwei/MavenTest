package com.mi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mi.dao.HrEntryMainMapper;
import com.mi.vo.HrEntryMain;

@Service
public class HrEntryMainService {
	
	@Autowired
	private HrEntryMainMapper hrEntryMainMapper;
	
	public HrEntryMain select(String id) {
		return hrEntryMainMapper.selectByPrimaryKey(id);
	}

}
