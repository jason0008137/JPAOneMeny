package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
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
		System.out.println("pic run run");
		List<Image> list = new ArrayList<Image>();
		SessionFactory sf = null;
		try
		{
			sf = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e)
		{
			System.err.println("Configuration sf GG" + e.getMessage());
			throw new ExceptionInInitializerError(e);
		}

		Session s = sf.openSession();
		Transaction ts = null;
		try
		{
			ts = s.beginTransaction();
			list = (List<Image>) s.createQuery("from Image").list();
			ts.commit();
			return list;
		} catch (Exception e)
		{
			if (ts != null)
				ts.rollback();
			e.printStackTrace();
		} finally
		{
			s.close();
			sf.close();
		}
		return list;
	}
//	@RequestMapping("/pic")
//	@ResponseBody
//	public List<Image> generatePicPath(Model m)
//	{
//		System.out.println("pic OK");
//		List<Image> list = Arrays.asList(
//				new Image(
//						1,
//						"images/p1.jpg",
//						"Lolo1",
//						"LOLILOLILOLI"),
//				new Image(
//						2,
//						"images/p2.jpg",
//						"Lolo2",
//						"LOLILOLILOLILOLILOLI"),
//				new Image(
//						3,
//						"images/p3.jpg",
//						"Lolo3",
//						"LOLILOLILOLILOLILOLILOLILOLI"));
//		return list;
//	}
}
