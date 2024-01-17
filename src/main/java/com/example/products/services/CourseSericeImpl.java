package com.example.products.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.products.entities.Course;

@Service
public class CourseSericeImpl implements CourseService {

	List<Course> list;
	
	public CourseSericeImpl()
	{
		list=new ArrayList<>();
		list.add(new Course(145,"java core course","this course contain basics of java"));
		list.add(new Course(123,"springboot core course","Creating rest api using spring boot"));
		

	}
	@Override
	public List<Course> getCourses() {
		return list;
	}
	@Override
	public Course getCourse(long courseId) {
		
		Course c=null;
		for(Course course:list)
		{
			
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}
	@Override
	public Course addCourse(Course course) {

		list.add(course);
		return course;
	}

}
