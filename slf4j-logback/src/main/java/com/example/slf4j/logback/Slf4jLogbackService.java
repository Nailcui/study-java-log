package com.example.slf4j.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author dingyu
 * @date 2022-02-09 11:41
 */
public class Slf4jLogbackService {

  private Logger logger = LoggerFactory.getLogger(Slf4jLogbackService.class);

  public void print() {
    logger.debug("debug Slf4jLogbackService.print()");
    logger.info("info Slf4jLogbackService.print()");
    logger.warn("warn Slf4jLogbackService.print()");
    logger.error("error Slf4jLogbackService.print()");
  }

}
