package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Image;

@Controller
public class ImageController
{
	@RequestMapping("/pic")
	@ResponseBody
	public List<Image> generatePicPath(Model m)
	{
		List<Image> list = Arrays.asList(
				new Image(
						"images/p1.jpg",
						"Lolo1",
						"LOLILOLILOLI"),
				new Image(
						"images/p2.jpg",
						"Lolo2",
						"LOLILOLILOLILOLILOLI"),
				new Image(
						"images/p3.jpg",
						"Lolo3",
						"LOLILOLILOLILOLILOLILOLILOLI"));
		return list;
	}
}
