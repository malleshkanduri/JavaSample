package tranformation.testData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import tranformation.testData.StudentVO.Course;

public class BuildTestData {
	
	public static StudentVO getStudentVo() {
		
		StudentVO vo = new StudentVO();
		vo.setName("Hello");
		
		Course course1 = new StudentVO.Course();
		course1.setName("C1");
		course1.setDescription("CourseOne");
		course1.setManditory(false);
		course1.setOfferingLocation(Arrays.asList("CA,TN".split(",")));
		

		Course course2 = new StudentVO.Course();
		course2.setName("C3");
		course2.setDescription("CourseTwo");
		course2.setManditory(true);
		course2.setOfferingLocation(Arrays.asList("AP,MP".split(",")));
		
		List<Course> listOfCourses = new ArrayList<Course>();
		listOfCourses.add(course1);
		listOfCourses.add(course2);
		
		vo.setEnrolledCourses(listOfCourses);
		
		return vo;
	}
}
