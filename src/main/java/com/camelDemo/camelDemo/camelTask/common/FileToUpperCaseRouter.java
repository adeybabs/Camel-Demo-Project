package com.camelDemo.camelDemo.camelTask.common;

import com.camelDemo.camelDemo.camelTask.service.FileProcessorService;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//This code listens and moves files from a directory to another and converts to uppercase
@Component
public class FileToUpperCaseRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:files/lowercase_input")
                .log("${body}")
                .process(new FileProcessorService())
                .to("file:files/upper_output");
    }
}

