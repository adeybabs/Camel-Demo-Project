package com.camelDemo.camelDemo.otherCamelExamples.common;

import com.camelDemo.camelDemo.otherCamelExamples.service.LoggingProcessorService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;


//@Component
public class TimerRouter extends RouteBuilder {

    @Autowired
    CurrentTimeBean getCurrentTimeBean;

    @Autowired
    private LoggingProcessingComponent loggingComponent;

    @Override
    public void configure() throws Exception {
        //timer
        //transf
        //log
        from("timer:first-timer")//null
                .log("${body}")//null
                .transform().constant("constant msg")
                //.transform().constant("Current Time: " + LocalDateTime.now())
                .bean(getCurrentTimeBean, "getCurrentTime")
                .log("${body}")
                .bean(loggingComponent)
                .log("${body}")
                .process(new LoggingProcessorService())
                .to("log:first-timer");//db
    }
}

