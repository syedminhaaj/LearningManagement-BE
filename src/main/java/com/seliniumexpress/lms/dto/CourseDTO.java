package com.seliniumexpress.lms.dto;

public class CourseDTO {
	
	    private String courseName;
	    private String courseDuration;
	    private int instructorId; // Add this field to capture the instructor ID from the payload
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public void setCourseDuration(String courseDuration) {
			this.courseDuration = courseDuration;
	  	}
		public void setInstructorId(int instructorId) {
			this.instructorId = instructorId;
		}
		public String getCourseName() {
			return courseName;
		}
		public String getCourseDuration() {
			return courseDuration;
		}
		public int getInstructorId() {
			return instructorId;
		}
		@Override
		public String toString() {
			return "CourseDTO [courseName=" + courseName + ", courseDuration=" + courseDuration + ", instructorId="
					+ instructorId + "]";
		}

	    
	    
	
}
