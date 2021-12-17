package com.camelDemo.camelDemo.routes.b;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//This code listens and moves files from a directory to another and converts to uppercase
@Component
public class FileToUpperCaseRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:files/lowercase_input")
                .log("${body}")
                .process(new FileProcessor())
                .to("file:files/upper_output");
    }
}

class FileProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        String originalFileContent = (String) exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        exchange.getIn().setBody(upperCaseFileContent);

    }
}
