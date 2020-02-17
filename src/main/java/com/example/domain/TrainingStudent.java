package com.example.domain;

/**
 * 研修受講生のエンティティクラス.
 * 
 * @author hiraokayuri
 *
 */
public class TrainingStudent {
	/** 研修ID　*/
	private Integer trainingId;
	/** 受講生ID　*/
	private Integer studentId;
	public Integer getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	@Override
	public String toString() {
		return "TrainingStudent [trainingId=" + trainingId + ", studentId=" + studentId + "]";
	}
	
	

}
