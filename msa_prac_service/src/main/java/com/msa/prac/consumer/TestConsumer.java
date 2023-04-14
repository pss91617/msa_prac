package com.msa.prac.consumer;

import com.msa.prac.spec.TestInterfaceService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.core.env.Environment;
import org.springframework.messaging.handler.annotation.Payload;

@Slf4j
@AllArgsConstructor
@EnableBinding(TestSinkInterface.class)
public class TestConsumer {

    private final TestInterfaceService testInterfaceService;
    private final Environment env;

    @StreamListener(TestSinkInterface.TEST_CHANNEL)
    public void channel(@Payload String payload) {
        log.info("    -------------------- TestConsumer Start --------------------");
        if(!payload.equals("[]")){
            log.info("Received payload");
            try{
                testInterfaceService.save(payload);
            }
            catch (Exception e) {
                e.printStackTrace();
                log.error(payload);
            }
        } else {
            log.error("payload is empty JSONArray. payload = {}", payload);
        }
//        log.info("    -------------------- TestConsumer End --------------------");

    }
}
