package com.seliniumexpress.lms.dto;

public class LessonDTO {
	
	private String lessonName;
	private String lessonText;
	private String lessonLink;
	private int courseId;
	
	
	public LessonDTO(String lessonName, String lessonText, String lessonLink, int courseId) {
		
		this.lessonName = lessonName;
		this.lessonText = lessonText;
		this.lessonLink = lessonLink;
		this.courseId = courseId;
	}
	public LessonDTO() {
		
	}
	@Override
	public String toString() {
		return "LessonDTO [lessonName=" + lessonName + ", lessonText=" + lessonText + ", lessonLink=" + lessonLink
				+ ", courseId=" + courseId + "]";
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public void setLessonText(String lessonText) {
		this.lessonText = lessonText;
	}
	public void setLessonLink(String lessonLink) {
		this.lessonLink = lessonLink;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getLessonName() {
		return lessonName;
	}
	public String getLessonText() {
		return lessonText;
	}
	public String getLessonLink() {
		return lessonLink;
	}
	public int getCourseId() {
		return courseId;
	}

}
