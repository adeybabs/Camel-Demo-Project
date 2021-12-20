package com.camelDemo.camelDemo.otherCamelExamples.common;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

//bean to generate d msg
@Component
public class CurrentTimeBean {

    public String getCurrentTime() {
        return "Current Time: " + LocalDateTime.now();
    }
}
