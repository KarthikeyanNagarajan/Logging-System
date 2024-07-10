package com.karthik.LoggingSystem.service;

import com.karthik.LoggingSystem.handler.DebugLogger;
import com.karthik.LoggingSystem.handler.ErrorLogger;
import com.karthik.LoggingSystem.handler.InfoLogger;
import com.karthik.LoggingSystem.handler.LoggerHandler;
import com.karthik.LoggingSystem.handler.LoggerType;

public class MainClass
{

	public static void main(String[] args)
	{
		LoggerHandler logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

		logger.handleRequest(LoggerType.INFO, "hello to info logger");
		logger.handleRequest(LoggerType.DEBUG, "hello to debug logger");
		logger.handleRequest(LoggerType.ERROR, "hello to error logger");
	}

}
