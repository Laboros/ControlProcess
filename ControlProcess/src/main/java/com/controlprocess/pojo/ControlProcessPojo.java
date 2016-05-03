package com.controlprocess.pojo;

public class ControlProcessPojo {
	
	private long controlProcessId;
	private String inboxLocation;
	private String cronJobStartTime;
	private String cronJobEndTime;
	private boolean cronJobSuccess;
	
	private boolean isCronJobHDFSDest;
	private boolean isMetaExist;
	private boolean isDatExist;
	private boolean isControlFileExist;
	
	private String metaFileInputLoc;
	private String metaFileDestLoc;
	
	private String dataFileInputLoc;
	private String dataFileDestLoc;
	
	private String controlFileInputLoc;
	private String controlFileDestLoc;
	
	private Enum status;
	//setters and getters

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

	public String getMetaFileInputLoc() {
		return metaFileInputLoc;
	}

	public void setMetaFileInputLoc(String metaFileInputLoc) {
		this.metaFileInputLoc = metaFileInputLoc;
	}

	public String getMetaFileDestLoc() {
		return metaFileDestLoc;
	}

	public void setMetaFileDestLoc(String metaFileDestLoc) {
		this.metaFileDestLoc = metaFileDestLoc;
	}

	public String getDataFileInputLoc() {
		return dataFileInputLoc;
	}

	public void setDataFileInputLoc(String dataFileInputLoc) {
		this.dataFileInputLoc = dataFileInputLoc;
	}

	public String getDataFileDestLoc() {
		return dataFileDestLoc;
	}

	public void setDataFileDestLoc(String dataFileDestLoc) {
		this.dataFileDestLoc = dataFileDestLoc;
	}

	public String getControlFileInputLoc() {
		return controlFileInputLoc;
	}

	public void setControlFileInputLoc(String controlFileInputLoc) {
		this.controlFileInputLoc = controlFileInputLoc;
	}

	public String getControlFileDestLoc() {
		return controlFileDestLoc;
	}

	public void setControlFileDestLoc(String controlFileDestLoc) {
		this.controlFileDestLoc = controlFileDestLoc;
	}

	public Enum getStatus() {
		return status;
	}

	public void setStatus(Enum status) {
		this.status = status;
	}
	
	
	
	
	
	

}
