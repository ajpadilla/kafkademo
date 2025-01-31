package com.alibou.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.alibou.kafkademo.payload.Student;


import static java.lang.String.format;
@Service
@Slf4j
public class KafkaConsumer {
    // @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from alibou Topic:: %s", msg));
    }

    @KafkaListener(topics = "alibou", groupId = "myGroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from alibou Topic:: %s", student.toString()));
    }
}