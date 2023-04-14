package com.msa.prac.store;

import com.msa.prac.annotation.ExtMariaDB;
import com.msa.prac.store.mapper.SaverMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
@ExtMariaDB
@MapperScan("com.msa.prac.store.mapper")
public class SaverMapperStore implements TestStore {

    private final SaverMapper saverMapper;

    @Override
    public int insert(String payload) {
        return saverMapper.insert(payload);
    }

}
