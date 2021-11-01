package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController
{
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student(@ModelAttribute("student") Student student)
	{
		Student s = new Student(2, "Fuck", 30);
		return new ModelAndView("student", "command", s);
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST/*, consumes = "application/x-www-form-urlencoded;charset=UTF-8"*/)
	public String addStudent(@ModelAttribute("student") Student student,
			ModelMap model)
	{
//		model.addAttribute("name", student.getName());
//		model.addAttribute("age", student.getAge());
//		model.addAttribute("id", student.getId());
		return "result";
	}
}