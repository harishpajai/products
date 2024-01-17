package com.example.products.services;

import java.util.List;

import com.example.products.entities.Course;

public interface CourseService {

	public List<Course> getCourses();

	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);
	
}
