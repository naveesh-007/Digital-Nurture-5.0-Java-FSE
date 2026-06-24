package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {

    private static final Logger logger = LoggerFactory.getLogger(LoggerExample.class);

    public void process() {

        logger.info("Application Started");

        logger.warn("This is a warning message");

        logger.error("This is an error message");

        logger.debug("Debugging application");
    }
}