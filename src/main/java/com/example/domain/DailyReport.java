package com.example.domain;

import java.time.LocalDate;

/**
 * 日報のエンティティクラス.
 *  
 * @author hiraokayuri
 *
 */
public class DailyReport {
	/** ID */
	private Integer id;
	/** 日付 */
	private LocalDate date;
	/** 研修ID */
	private Integer trainingId;
	/** 受講生ID */
	private Integer studanteId;
	/** 内容 */
	private String content;
	/** 理解度 */
	private Integer intelligibillity;
	/** 理解度詳細 */
	private String detaillntelligibillty;
	/** 講師について */
	private Integer aboutInstructor;
	/** 質問 */
	private String question;
	/** 研修 */
	private Training training;
	/** 受講生 */
	private Student student;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}
	public Integer getStudanteId() {
		return studanteId;
	}
	public void setStudanteId(Integer studanteId) {
		this.studanteId = studanteId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getIntelligibillity() {
		return intelligibillity;
	}
	public void setIntelligibillity(Integer intelligibillity) {
		this.intelligibillity = intelligibillity;
	}
	public String getDetaillntelligibillty() {
		return detaillntelligibillty;
	}
	public void setDetaillntelligibillty(String detaillntelligibillty) {
		this.detaillntelligibillty = detaillntelligibillty;
	}
	public Integer getAboutInstructor() {
		return aboutInstructor;
	}
	public void setAboutInstructor(Integer aboutInstructor) {
		this.aboutInstructor = aboutInstructor;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Training getTraining() {
		return training;
	}
	public void setTraining(Training training) {
		this.training = training;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "DailyReport [id=" + id + ", date=" + date + ", trainingId=" + trainingId + ", studanteId=" + studanteId
				+ ", content=" + content + ", intelligibillity=" + intelligibillity + ", detaillntelligibillty="
				+ detaillntelligibillty + ", aboutInstructor=" + aboutInstructor + ", question=" + question
				+ ", training=" + training + ", student=" + student + "]";
	}
	
	

}
