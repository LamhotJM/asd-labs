package edu.miu.cs.cs525.labs.adapter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//Lamhot
public class LoggerAdapter implements LoggerLib {
  private static final Logger logger = LogManager.getLogger(LoggerLib.class);

  public LoggerAdapter(){};

  @Override
  public void log(LogLevel logLevel, String message) {
    if(logLevel.equals(LogLevel.ERROR))
      logger.error("error... " + message);
   
    else if(logLevel.equals(LogLevel.FATAL))
      logger.fatal("fatal... " + message);
    
    else if(logLevel.equals(LogLevel.INFO))
        logger.info("info... " + message);
      else if(logLevel.equals(LogLevel.DEBUG))
        logger.debug("debugging... " + message);
    
    else if(logLevel.equals(LogLevel.WARNING))
      logger.warn("warning... " + message);
    else
      logger.trace("trace..." + message);
  }
}
