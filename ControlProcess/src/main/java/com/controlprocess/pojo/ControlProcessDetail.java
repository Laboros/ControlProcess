package com.controlprocess.pojo;

import java.sql.Timestamp;

import com.controlprocess.constants.ControlProcessConstants;
import com.controlprocess.constants.Status;


public class ControlProcessDetail {
	
	private long controlProcessDetailId;//RDBMS generated id
	private ControlProcess controlProcess;//Foreign key
	
	private String baseControlFileNameWithLoc; //Control File Name
	private String baseDatFileNameWithLoc;//Data file name
	private String baseMetaFileNameWithLoc; //Meta File Name
	
	private String destControlFileNameWithLoc; //Control File Name
	private String destDatFileNameWithLoc;//Data file name
	private String destMetaFileNameWithLoc; //Meta File Name
	
	
	private String hdfsCtlFileLoc;
	private String hdfsMetaFileLoc;
	private String hdfsDatFileLoc;
	
	private String status=Status.MOVED.getStringValue();
	
	private String schemaValidation=ControlProcessConstants.NA.getStringValue(); //N/A,FAILED,SUCCESS
	private String rowCountValidation;//N/A,FAILED,SUCCESS
	private String crcValidation;//N/A,FAILED,SUCCESS
	
	private boolean ctlRowCountExist=Boolean.FALSE;
	private long ctlRowCount;
	private long computedRowCount;
	
	private String detailLogFileLoc;
	
	private Timestamp insertedDate=new Timestamp(System.currentTimeMillis());
	private Timestamp updatedDate=new Timestamp(System.currentTimeMillis());
	
	
	
	public long getControlProcessDetailId() {
		return controlProcessDetailId;
	}
	public void setControlProcessDetailId(long controlProcessDetailId) {
		this.controlProcessDetailId = controlProcessDetailId;
	}
	
	public ControlProcess getControlProcess() {
		return controlProcess;
	}
	public void setControlProcess(ControlProcess controlProcess) {
		this.controlProcess = controlProcess;
	}
	
	
	public String getBaseControlFileNameWithLoc() {
		return baseControlFileNameWithLoc;
	}
	public void setBaseControlFileNameWithLoc(String baseControlFileNameWithLoc) {
		this.baseControlFileNameWithLoc = baseControlFileNameWithLoc;
	}
	public String getBaseDatFileNameWithLoc() {
		return baseDatFileNameWithLoc;
	}
	public void setBaseDatFileNameWithLoc(String baseDatFileNameWithLoc) {
		this.baseDatFileNameWithLoc = baseDatFileNameWithLoc;
	}
	public String getBaseMetaFileNameWithLoc() {
		return baseMetaFileNameWithLoc;
	}
	public void setBaseMetaFileNameWithLoc(String baseMetaFileNameWithLoc) {
		this.baseMetaFileNameWithLoc = baseMetaFileNameWithLoc;
	}
	public String getDestControlFileNameWithLoc() {
		return destControlFileNameWithLoc;
	}
	public void setDestControlFileNameWithLoc(String destControlFileNameWithLoc) {
		this.destControlFileNameWithLoc = destControlFileNameWithLoc;
	}
	public String getDestDatFileNameWithLoc() {
		return destDatFileNameWithLoc;
	}
	public void setDestDatFileNameWithLoc(String destDatFileNameWithLoc) {
		this.destDatFileNameWithLoc = destDatFileNameWithLoc;
	}
	public String getDestMetaFileNameWithLoc() {
		return destMetaFileNameWithLoc;
	}
	public void setDestMetaFileNameWithLoc(String destMetaFileNameWithLoc) {
		this.destMetaFileNameWithLoc = destMetaFileNameWithLoc;
	}
	public String getHdfsCtlFileLoc() {
		return hdfsCtlFileLoc;
	}
	public void setHdfsCtlFileLoc(String hdfsCtlFileLoc) {
		this.hdfsCtlFileLoc = hdfsCtlFileLoc;
	}
	public String getHdfsMetaFileLoc() {
		return hdfsMetaFileLoc;
	}
	public void setHdfsMetaFileLoc(String hdfsMetaFileLoc) {
		this.hdfsMetaFileLoc = hdfsMetaFileLoc;
	}
	public String getHdfsDatFileLoc() {
		return hdfsDatFileLoc;
	}
	public void setHdfsDatFileLoc(String hdfsDatFileLoc) {
		this.hdfsDatFileLoc = hdfsDatFileLoc;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSchemaValidation() {
		return schemaValidation;
	}
	public void setSchemaValidation(String schemaValidation) {
		this.schemaValidation = schemaValidation;
	}
	public String getRowCountValidation() {
		return rowCountValidation;
	}
	public void setRowCountValidation(String rowCountValidation) {
		this.rowCountValidation = rowCountValidation;
	}
	public String getCrcValidation() {
		return crcValidation;
	}
	public void setCrcValidation(String crcValidation) {
		this.crcValidation = crcValidation;
	}
	public boolean isCtlRowCountExist() {
		return ctlRowCountExist;
	}
	public void setCtlRowCountExist(boolean ctlRowCountExist) {
		this.ctlRowCountExist = ctlRowCountExist;
	}
	public long getCtlRowCount() {
		return ctlRowCount;
	}
	public void setCtlRowCount(long ctlRowCount) {
		this.ctlRowCount = ctlRowCount;
	}
	public long getComputedRowCount() {
		return computedRowCount;
	}
	public void setComputedRowCount(long computedRowCount) {
		this.computedRowCount = computedRowCount;
	}
	public String getDetailLogFileLoc() {
		return detailLogFileLoc;
	}
	public void setDetailLogFileLoc(String detailLogFileLoc) {
		this.detailLogFileLoc = detailLogFileLoc;
	}
	public Timestamp getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Timestamp insertedDate) {
		this.insertedDate = insertedDate;
	}
	public Timestamp getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}
}
