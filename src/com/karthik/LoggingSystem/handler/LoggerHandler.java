package com.karthik.LoggingSystem.handler;

public abstract class LoggerHandler
{
	LoggerHandler nextHandler;

	public LoggerHandler(LoggerHandler nextHandler)
	{
		this.nextHandler = nextHandler;
	}

	public void handleRequest(LoggerType type, String msg)
	{
		if (nextHandler != null)
		{
			nextHandler.handleRequest(type, msg);
		}
	}
}
