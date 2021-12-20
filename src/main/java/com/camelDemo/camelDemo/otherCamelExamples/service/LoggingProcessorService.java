package com.camelDemo.camelDemo.otherCamelExamples.service;

import com.camelDemo.camelDemo.otherCamelExamples.common.LoggingProcessingComponent;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingProcessorService implements Processor {

    private Logger logger = LoggerFactory.getLogger(LoggingProcessingComponent.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        logger.info("LoggingProcessorService {}", exchange.getMessage().getBody());

    }
}
