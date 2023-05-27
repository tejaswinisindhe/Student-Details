package com.example.Company;


	import java.util.ArrayList;
	import java.util.List;

	import org.apache.coyote.http11.Http11InputBuffer;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.jpa.repository.Query;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.ResponseBody;

	import jakarta.servlet.http.HttpSession;

	@Controller
	public class StdController 
	{
		
		@Autowired
		StudentRepo repo;
		
		@RequestMapping("show")
		String stdFrontEnd()
		{
			System.out.println("xxxxx");
			return "std.jsp";
		}
		
		@RequestMapping("addStud")
		@ResponseBody
		Student backtoMain(Student s)
		{
			return repo.save(s);
		}
		
		@RequestMapping("findStdByMarks")
		
		String findByTotalMarks(HttpSession h1, Integer marks)
		{
			
			
			List<Student> std= repo.findByTotalMarks(marks);
			System.out.println("---------------");
			
			h1.setAttribute("student", std);
			return "display.jsp";		
		}
		
		
		@RequestMapping("display")
		Student displayDetails(Student s)
		{
			return s;
		}

	}


