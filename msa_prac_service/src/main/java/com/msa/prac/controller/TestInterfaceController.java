package com.msa.prac.controller;

import com.msa.prac.service.SaverService;
import com.msa.prac.spec.TestInterfaceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@AllArgsConstructor
public class TestInterfaceController implements TestInterfaceService {

    private final SaverService saverService;

    @Override
    public void save(String payload) throws Exception {
        try {
            saverService.save(payload);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
