package com.camelDemo.camelDemo.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActivMQSenderRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        //timer
        //on regular interval put msgs on queue
//        from("timer:active-mq-timer?period=10000")
//                .transform().constant("message for activeMQ")
//                .log("${body}")
//                .to("activemq:my-activemq-queue");
        //queue


//        from("file:files/json")
//                .log("${body}")
//                .to("activemq:my-activemq-queue");



        //xml
        from("file:files/xml")
                .log("${body}")
                .to("activemq:my-activemq-xml-queue");
    }
}