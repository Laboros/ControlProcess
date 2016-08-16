package com.controlprocess.util;

import java.util.UUID;

public class ControlProcessUtil {
	
	public static String genarateControlProcessId()
	{
		return UUID.randomUUID().toString();
	}

}
