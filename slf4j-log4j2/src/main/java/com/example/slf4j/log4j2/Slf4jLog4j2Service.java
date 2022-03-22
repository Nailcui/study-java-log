package com.example.slf4j.log4j2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dingyu
 * @date 2022-02-09 14:39
 */
public class Slf4jLog4j2Service {

  private Logger logger = LoggerFactory.getLogger(Slf4jLog4j2Service.class);

  public void print() {
    logger.debug("debug Slf4jLog4j2Service.print()");
    logger.info("info Slf4jLog4j2Service.print()");
    logger.warn("warn Slf4jLog4j2Service.print()");
    logger.error("error Slf4jLog4j2Service.print()");
  }

}
