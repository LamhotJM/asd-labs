package edu.miu.cs.cs525.labs.adapter;

public class Application {
  public static void main(String[] args){
    LoggerAdapter adapter = new LoggerAdapter();
    adapter.log(LogLevel.DEBUG, "debug message");
    adapter.log(LogLevel.FATAL, "fatal message");
    adapter.log(LogLevel.ERROR, "error message");
    adapter.log(LogLevel.WARNING, "warning message");
    adapter.log(LogLevel.INFO, "info message");
    adapter.log(LogLevel.TRACE, "trace message");
  }
}
