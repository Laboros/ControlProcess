package com.controlprocess.pojo;

import java.util.List;


public class ControlProcessMaster {
	
	private long controlProcessId;
	private String inboxLocation;
	private String cronJobStartTime;
	private String cronJobEndTime;
	
	private String cronJobName;
	
	private boolean cronJobSuccess=Boolean.TRUE; //Cron job succes or failed
	
	private boolean isCronJobHDFSDest=Boolean.TRUE;
	private boolean isMetaExist=Boolean.TRUE;
	private boolean isDatExist=Boolean.TRUE;
	private boolean isControlFileExist=Boolean.TRUE; //Some times the data file itself the control file
	
	//setters and getters	
	
	@SuppressWarnings("rawtypes")
	private Enum status; //Complete status of the process.
	
	private List<ControlProcessDetail> details;

	public long getControlProcessId() {
		return controlProcessId;
	}

	public void setControlProcessId(long controlProcessId) {
		this.controlProcessId = controlProcessId;
	}

	public String getInboxLocation() {
		return inboxLocation;
	}

	public void setInboxLocation(String inboxLocation) {
		this.inboxLocation = inboxLocation;
	}

	public String getCronJobStartTime() {
		return cronJobStartTime;
	}

	public void setCronJobStartTime(String cronJobStartTime) {
		this.cronJobStartTime = cronJobStartTime;
	}

	public String getCronJobEndTime() {
		return cronJobEndTime;
	}

	public void setCronJobEndTime(String cronJobEndTime) {
		this.cronJobEndTime = cronJobEndTime;
	}

	public String getCronJobName() {
		return cronJobName;
	}

	public void setCronJobName(String cronJobName) {
		this.cronJobName = cronJobName;
	}

	public boolean isCronJobSuccess() {
		return cronJobSuccess;
	}

	public void setCronJobSuccess(boolean cronJobSuccess) {
		this.cronJobSuccess = cronJobSuccess;
	}

	public boolean isCronJobHDFSDest() {
		return isCronJobHDFSDest;
	}

	public void setCronJobHDFSDest(boolean isCronJobHDFSDest) {
		this.isCronJobHDFSDest = isCronJobHDFSDest;
	}

	public boolean isMetaExist() {
		return isMetaExist;
	}

	public void setMetaExist(boolean isMetaExist) {
		this.isMetaExist = isMetaExist;
	}

	public boolean isDatExist() {
		return isDatExist;
	}

	public void setDatExist(boolean isDatExist) {
		this.isDatExist = isDatExist;
	}

	public boolean isControlFileExist() {
		return isControlFileExist;
	}

	public void setControlFileExist(boolean isControlFileExist) {
		this.isControlFileExist = isControlFileExist;
	}

	@SuppressWarnings("rawtypes")
	public Enum getStatus() {
		return status;
	}

	@SuppressWarnings("rawtypes")
	public void setStatus(Enum status) {
		this.status = status;
	}

	public List<ControlProcessDetail> getDetails() {
		return details;
	}

	public void setDetails(List<ControlProcessDetail> details) {
		this.details = details;
	}
	
 	
}