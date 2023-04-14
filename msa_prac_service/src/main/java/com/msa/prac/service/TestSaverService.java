package com.msa.prac.service;

import com.msa.prac.store.GtestStore;
import com.msa.prac.store.TestStore;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@RequiredArgsConstructor
@Service
public class TestSaverService implements SaverService {

    private final GtestStore gtestStore;

    @Override
    public void save(String payload) throws Exception{


        try{

            log.info("-------------------- Received Billing payload --------------------");
            log.info("payload :: {}", payload);
            int insertSuccessCount = gtestStore.insertPayload(payload);


            if(insertSuccessCount == 1) {
                log.info(payload + "Save Success");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

