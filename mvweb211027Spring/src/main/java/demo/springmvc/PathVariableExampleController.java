package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathVariableExampleController
{
	/**
	 * @PathVariable Example:
	 *
	 */
	@RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
	/*
	測試網址打這個：
	web/fe/default/en/document/8080/spring-mvc-for-beginners
	*/
	public String documentView(Model model,
			@PathVariable(value = "sitePrefix") String sitePrefix,
			@PathVariable(value = "language") String language,
			@PathVariable(value = "id") Long id,
			@PathVariable(value = "naturalText") String naturalText)
	{

		model.addAttribute("sitePrefix", sitePrefix);
		model.addAttribute("language", language);
		model.addAttribute("id", id);
		model.addAttribute("naturalText", naturalText);

//		String documentName = "Java tutorial for Beginners";
		String documentName = "Shit";
		if (id == 8080)
		{
//			documentName = "Spring MVC for Beginners";
			documentName = "Hell yeah";
		}

		model.addAttribute("documentName", documentName);

		return "documentView";
	}
}
