package com.example.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * 研修のエンティティクラス.
 * 
 * @author hiraokayuri
 *
 */
public class Training {
	/**　ID */
	private Integer id;
	/**　開始日　 */
	private LocalDate startDate;
	/**　終了日 */
	private LocalDate endDate;
	/**　研修名 */
	private String name;
	/**　講師ID */
	private Integer InstructorId;
	/**　サブ講師ID1 */
	private Integer subInstructorId1;
	/**　サブ講師ID2 */
	private Integer subInstructorId2;
	/**　サブ講師ID3 */
	private Integer subInstructorId3;
	/**　講師 */
	private Instructor instructor;
	/**　講師 */
	private Instructor subInstructor1;
	/**　講師 */
	private Instructor subInstructor2;
	/**　講師 */
	private Instructor subInstructor3;
	/**　受講生リスト */
	private List<Student> studentList;
	/**　週報リスト */
	private List<WeeklyReport> weeklyReportList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(Integer instructorId) {
		InstructorId = instructorId;
	}
	public Integer getSubInstructorId1() {
		return subInstructorId1;
	}
	public void setSubInstructorId1(Integer subInstructorId1) {
		this.subInstructorId1 = subInstructorId1;
	}
	public Integer getSubInstructorId2() {
		return subInstructorId2;
	}
	public void setSubInstructorId2(Integer subInstructorId2) {
		this.subInstructorId2 = subInstructorId2;
	}
	public Integer getSubInstructorId3() {
		return subInstructorId3;
	}
	public void setSubInstructorId3(Integer subInstructorId3) {
		this.subInstructorId3 = subInstructorId3;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Instructor getSubInstructor1() {
		return subInstructor1;
	}
	public void setSubInstructor1(Instructor subInstructor1) {
		this.subInstructor1 = subInstructor1;
	}
	public Instructor getSubInstructor2() {
		return subInstructor2;
	}
	public void setSubInstructor2(Instructor subInstructor2) {
		this.subInstructor2 = subInstructor2;
	}
	public Instructor getSubInstructor3() {
		return subInstructor3;
	}
	public void setSubInstructor3(Instructor subInstructor3) {
		this.subInstructor3 = subInstructor3;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public List<WeeklyReport> getWeeklyReportList() {
		return weeklyReportList;
	}
	public void setWeeklyReportList(List<WeeklyReport> weeklyReportList) {
		this.weeklyReportList = weeklyReportList;
	}
	@Override
	public String toString() {
		return "Training [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", name=" + name
				+ ", InstructorId=" + InstructorId + ", subInstructorId1=" + subInstructorId1 + ", subInstructorId2="
				+ subInstructorId2 + ", subInstructorId3=" + subInstructorId3 + ", instructor=" + instructor
				+ ", subInstructor1=" + subInstructor1 + ", subInstructor2=" + subInstructor2 + ", subInstructor3="
				+ subInstructor3 + ", studentList=" + studentList + ", weeklyReportList=" + weeklyReportList + "]";
	}
	
	
	

}
