package com.controlprocess.constants;

public enum ControlProcessConstants {
	
	FALSE(Boolean.FALSE),
	TRUE(Boolean.TRUE),
	NA("N/A");
	
	private String value;
	private boolean bValue;
	private ControlProcessConstants(final boolean bValue){
		this.bValue=bValue;
	}
	private ControlProcessConstants(final String value) 
	{
		this.value=value;
	}
	
	public String getStringValue()
	{
		return this.value;
	}
	public boolean getBooleanValue(){
		return this.bValue;
	}

}
