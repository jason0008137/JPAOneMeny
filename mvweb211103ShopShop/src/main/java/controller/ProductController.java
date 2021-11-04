package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController
{
	@RequestMapping("/pro")
	public String produce(ModelMap model)
	{
		return "product";
	}
}
