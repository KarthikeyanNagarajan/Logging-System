package com.karthik.LoggingSystem.handler;

public class ErrorLogger extends LoggerHandler
{

	public ErrorLogger(LoggerHandler nextHandler)
	{
		super(nextHandler);
	}

	@Override
	public void handleRequest(LoggerType type, String msg)
	{
		if (type.name().equals(LoggerType.ERROR.name()))
		{
			System.out.println("ERROR: " + msg);
		}
		else
		{
			super.handleRequest(type, msg);
		}
	}

}
