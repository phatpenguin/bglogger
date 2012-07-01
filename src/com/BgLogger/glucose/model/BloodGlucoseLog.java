package com.BgLogger.glucose.model;

import java.math.BigDecimal;
import java.util.Date;

public class BloodGlucoseLog {
	private Long id;
	private Long bloodGlucoseMeasurementUnitId;
	private BloodGlucoseMeasurementUnit BloodGlucoseMeasurementUnit;
	private Long bloodGlucoseTypeId;
	private BloodGlucoseType bloodGlucoseType;
	private BigDecimal reading;
	private Date logTime;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the bloodGlucoseMeasurementUnitId
	 */
	public Long getBloodGlucoseMeasurementUnitId() {
		return bloodGlucoseMeasurementUnitId;
	}
	/**
	 * @param bloodGlucoseMeasurementUnitId the bloodGlucoseMeasurementUnitId to set
	 */
	public void setBloodGlucoseMeasurementUnitId(Long bloodGlucoseMeasurementUnitId) {
		this.bloodGlucoseMeasurementUnitId = bloodGlucoseMeasurementUnitId;
	}
	/**
	 * @return the bloodGlucoseMeasurementUnit
	 */
	public BloodGlucoseMeasurementUnit getBloodGlucoseMeasurementUnit() {
		return BloodGlucoseMeasurementUnit;
	}
	/**
	 * @param bloodGlucoseMeasurementUnit the bloodGlucoseMeasurementUnit to set
	 */
	public void setBloodGlucoseMeasurementUnit(
			BloodGlucoseMeasurementUnit bloodGlucoseMeasurementUnit) {
		BloodGlucoseMeasurementUnit = bloodGlucoseMeasurementUnit;
	}
	/**
	 * @return the bloodGlucoseTypeId
	 */
	public Long getBloodGlucoseTypeId() {
		return bloodGlucoseTypeId;
	}
	/**
	 * @param bloodGlucoseTypeId the bloodGlucoseTypeId to set
	 */
	public void setBloodGlucoseTypeId(Long bloodGlucoseTypeId) {
		this.bloodGlucoseTypeId = bloodGlucoseTypeId;
	}
	/**
	 * @return the bloodGlucoseType
	 */
	public BloodGlucoseType getBloodGlucoseType() {
		return bloodGlucoseType;
	}
	/**
	 * @param bloodGlucoseType the bloodGlucoseType to set
	 */
	public void setBloodGlucoseType(BloodGlucoseType bloodGlucoseType) {
		this.bloodGlucoseType = bloodGlucoseType;
	}
	/**
	 * @return the reading
	 */
	public BigDecimal getReading() {
		return reading;
	}
	/**
	 * @param reading the reading to set
	 */
	public void setReading(BigDecimal reading) {
		this.reading = reading;
	}
	/**
	 * @return the log_time
	 */
	public Date getLogTime() {
		return logTime;
	}
	/**
	 * @param log_time the log_time to set
	 */
	public void setLog_time(Date logTime) {
		this.logTime = logTime;
	}
}
