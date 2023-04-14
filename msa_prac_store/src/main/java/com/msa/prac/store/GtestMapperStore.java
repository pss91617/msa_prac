package com.msa.prac.store;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class GtestMapperStore implements GtestStore {

    @Autowired
    SqlSessionTemplate sqlSession;

    @Override
    public int insertPayload(String payload) {
        return sqlSession.insert("SaverMapper.insert", payload);
    }
}