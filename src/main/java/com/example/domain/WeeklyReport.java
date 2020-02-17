package com.example.domain;

import java.time.LocalDate;
import java.util.List;

/**
 * 週報のエンティティクラス.
 * 
 * @author hiraokayuri
 *
 */
public class WeeklyReport {
	/**　ID */
	private Integer id;
	/**　週の初めの日　*/
	private LocalDate startDate;
	/**　講師名　*/
	private String instructorName;
	/**　内容 */
	private String content;
	/**　受講生所感リスト */
	private List<StudentImpression> studentImpression;
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
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<StudentImpression> getStudentImpression() {
		return studentImpression;
	}
	public void setStudentImpression(List<StudentImpression> studentImpression) {
		this.studentImpression = studentImpression;
	}
	@Override
	public String toString() {
		return "WeeklyReport [id=" + id + ", startDate=" + startDate + ", instructorName=" + instructorName
				+ ", content=" + content + ", studentImpression=" + studentImpression + "]";
	}
	
	
	

}
