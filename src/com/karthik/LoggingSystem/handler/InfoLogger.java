package com.karthik.LoggingSystem.handler;

public class InfoLogger extends LoggerHandler
{

	public InfoLogger(LoggerHandler nextHandler)
	{
		super(nextHandler);
	}

	@Override
	public void handleRequest(LoggerType type, String msg)
	{
		if (type.name().equals(LoggerType.INFO.name()))
		{
			System.out.println("INFO: " + msg);
		}
		else
		{
			super.handleRequest(type, msg);
		}
	}

}
