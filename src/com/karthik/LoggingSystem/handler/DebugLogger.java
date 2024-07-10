package com.karthik.LoggingSystem.handler;

public class DebugLogger extends LoggerHandler
{

	public DebugLogger(LoggerHandler nextHandler)
	{
		super(nextHandler);
	}

	@Override
	public void handleRequest(LoggerType type, String msg)
	{
		if (type.name().equals(LoggerType.DEBUG.name()))
		{
			System.out.println("DEBUG: " + msg);
		}
		else
		{
			super.handleRequest(type, msg);
		}
	}

}
