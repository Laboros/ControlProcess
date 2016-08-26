package com.controlprocess.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.controlprocess.constants.ProcessType;
import com.controlprocess.constants.Status;

public class ControlProcess {
	
	private long id; //Database id
	private String controlProcessId;//CRON ID or oozie id
	private Timestamp startTime;
	private Timestamp endTime;
	private String processType=ProcessType.CRON.getStringValue();  //CRON or OOZIE or Other
	private String status=Status.MOVED.getStringValue();
	private String userName=System.getenv("user.name");
	
	

	//Reference to ControlProcessDetail
	private Set<ControlProcessDetail> detail=new HashSet<ControlProcessDetail>(0);
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getControlProcessId() {
		return controlProcessId;
	}
	public void setControlProcessId(String controlProcessId) {
		this.controlProcessId = controlProcessId;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	
	public String getProcessType() {
		return processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<ControlProcessDetail> getDetail() {
		return detail;
	}
	public void setDetail(Set<ControlProcessDetail> detail) {
		this.detail = detail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

//	public void addControlProcessDetail(final ControlProcessDetail controlProcessDetail)
//	{
//		if(this.detail==null)
//		{
//			this.detail=new HashSet<ControlProcessDetail>();
//		}
//		this.detail.add(controlProcessDetail);
//	}
//	
}
