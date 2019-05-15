package com.mi.dao;

import org.apache.ibatis.annotations.Mapper;

import com.mi.vo.HrEntryMain;

@Mapper
public interface HrEntryMainMapper{

    //@Query("form HrEntryMain where fdId =:fdId")
    HrEntryMain selectByPrimaryKey(String fdId);
}