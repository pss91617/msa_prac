package com.msa.prac.store.mapper;


import com.msa.prac.annotation.ExtMariaDB;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@ExtMariaDB
public interface SaverMapper {
    int insert(String payload);
}
