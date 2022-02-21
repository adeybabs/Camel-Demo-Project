package com.camelDemo.camelDemo.camelTask.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

//code to implement processor and do the exchange
public class FileProcessorService implements Processor {

    public void process(Exchange exchange) throws Exception {
        String originalFileContent = (String) exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        exchange.getIn().setBody(upperCaseFileContent);

    }
}
