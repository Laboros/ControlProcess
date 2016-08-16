package com.controlprocess.pojo;

public class ControlProcessDetail {
	
	private long controlProcessDetailId;
	
	private String metaFileNameWithInputLoc;
	private String metaFileNameWithDestLoc;
	
	private String dataFileNameWithInputLoc;
	private String dataFileNameWithDestLoc;
	
	private String controlNameWithFileInputLoc;
	private String controlNameWithFileDestLoc;
	
	
	@SuppressWarnings("rawtypes")
	private Enum status;


	public long getControlProcessDetailId() {
		return controlProcessDetailId;
	}


	public void setControlProcessDetailId(long controlProcessDetailId) {
		this.controlProcessDetailId = controlProcessDetailId;
	}


	public String getMetaFileNameWithInputLoc() {
		return metaFileNameWithInputLoc;
	}


	public void setMetaFileNameWithInputLoc(String metaFileNameWithInputLoc) {
		this.metaFileNameWithInputLoc = metaFileNameWithInputLoc;
	}


	public String getMetaFileNameWithDestLoc() {
		return metaFileNameWithDestLoc;
	}


	public void setMetaFileNameWithDestLoc(String metaFileNameWithDestLoc) {
		this.metaFileNameWithDestLoc = metaFileNameWithDestLoc;
	}


	public String getDataFileNameWithInputLoc() {
		return dataFileNameWithInputLoc;
	}


	public void setDataFileNameWithInputLoc(String dataFileNameWithInputLoc) {
		this.dataFileNameWithInputLoc = dataFileNameWithInputLoc;
	}


	public String getDataFileNameWithDestLoc() {
		return dataFileNameWithDestLoc;
	}


	public void setDataFileNameWithDestLoc(String dataFileNameWithDestLoc) {
		this.dataFileNameWithDestLoc = dataFileNameWithDestLoc;
	}


	public String getControlNameWithFileInputLoc() {
		return controlNameWithFileInputLoc;
	}


	public void setControlNameWithFileInputLoc(String controlNameWithFileInputLoc) {
		this.controlNameWithFileInputLoc = controlNameWithFileInputLoc;
	}


	public String getControlNameWithFileDestLoc() {
		return controlNameWithFileDestLoc;
	}


	public void setControlNameWithFileDestLoc(String controlNameWithFileDestLoc) {
		this.controlNameWithFileDestLoc = controlNameWithFileDestLoc;
	}


	@SuppressWarnings("rawtypes")
	public Enum getStatus() {
		return status;
	}


	@SuppressWarnings("rawtypes")
	public void setStatus(Enum status) {
		this.status = status;
	}
	
}