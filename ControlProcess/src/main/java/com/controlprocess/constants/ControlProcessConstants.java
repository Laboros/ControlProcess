package com.controlprocess.constants;

public enum ControlProcessConstants {
	
	MOVED("MOVED"),
	INBOX("INBOX"),
	READY("READY"),
	PROCESSED("PROCESSED"),
	COMPLETED("COMPLETED"),
	FAILED("FAILED");
	
	private String value;
	
	private ControlProcessConstants(final String value) 
	{
		this.value=value;
	}
	
	public String getValue()
	{
		return this.value;
	}

}
