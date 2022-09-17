package io.github.kavishkamk.springdemo.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	
	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		this.coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		return value != null ? value.startsWith(coursePrefix) : true;
	}

}
