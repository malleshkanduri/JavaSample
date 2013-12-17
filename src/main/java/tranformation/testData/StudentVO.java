package tranformation.testData;

import java.util.List;

public class StudentVO {
	String name;
	boolean courseEnrolled;
	List<Course> enrolledCourses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(boolean courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}
	public void setEnrolledCourses(List<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}
 
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", courseEnrolled=" + courseEnrolled
				+ ", enrolledCourses=" + enrolledCourses + "]";
	}


	static class Course {
		String name;
		String description;
		boolean isManditory;
		List<String> offeringLocation;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public boolean isManditory() {
			return isManditory;
		}
		public void setManditory(boolean isManditory) {
			this.isManditory = isManditory;
		}
		public List<String> getOfferingLocation() {
			return offeringLocation;
		}
		public void setOfferingLocation(List<String> offeringLocation) {
			this.offeringLocation = offeringLocation;
		}
		
		@Override
		public String toString() {
			return "Course [name=" + name + ", description=" + description
					+ ", isManditory=" + isManditory + ", offeringLocation="
					+ offeringLocation + "]";
		}
		
	}
	
}
