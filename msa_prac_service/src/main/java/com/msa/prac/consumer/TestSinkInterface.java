package com.msa.prac.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TestSinkInterface {

    String TEST_CHANNEL = "testChannel";

    @Input(TestSinkInterface.TEST_CHANNEL)
    SubscribableChannel masterCommandChannel();

}
