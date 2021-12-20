package com.camelDemo.camelDemo.camelTask.common;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//simple code that moves file from one directory to another
@Component
public class MyFileRouter extends RouteBuilder {

   // playing with files using camel
    @Override
    public void configure() throws Exception {
        from("file:files/input")
                .log("${body}")
                .to("file:files/output");
    }
}
