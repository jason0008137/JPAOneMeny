package controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import MyMod.Epacount;
import MyMod.Epproduct;
import model.Account;
import model.Image;

@Controller
public class EPIndexController
{
	@RequestMapping("/welcome")
	public String login(ModelMap model)
	{
		System.out.println("EPIndexController welcome OK");
		return "my/login";
	}

	@RequestMapping("/loginCheck")
	@ResponseBody
	public String checkAccount(@ModelAttribute("epacount") Epacount acc)
	{
		String str = "Loging fail";

		List<Epacount> list = new ArrayList<Epacount>();
		SessionFactory sf = null;
		try
		{
			sf = new Configuration().configure().buildSessionFactory();
		} catch (Throwable e)
		{
			System.out.println("Configuration sf GG" + e.getMessage());
			throw new ExceptionInInitializerError(e);
		}

		Session s = sf.openSession();
		Transaction ts = null;
		try
		{
			ts = s.beginTransaction();
			list = (List<Epacount>) s.createQuery("from Epacount").list();
			ts.commit();

			System.out.print("YATA:" + acc.getUsername() + "\t" + acc.getPw());

			for (Epacount account : list)
			{
				if (account.getUsername().equals(acc.getUsername()) && account.getPw().equals(acc.getPw()))
				{
					str = "Logged in";
					return str;
				}
			}
		} catch (HibernateException e)
		{
			System.out.println("AAAAAAAAAAAAAAAAA");
			if (ts != null)
			{
				System.out.println("BBBBBBBBBBBBBBBBBBB");
				ts.rollback();
			}
			e.printStackTrace();
		} finally
		{
			s.close();
			sf.close();
		}

		return str;
	}

	@RequestMapping("/shop")
	public String produce(ModelMap model)
	{
		System.out.println("shop OK");
		return "my/product";
	}

	@RequestMapping("/showPInfo")
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
//	public List<Epproduct> showEpicProductInfo(Model m)
//	{
//		System.out.println("showEpicProductInfo run run");
//
//		List<Epproduct> list = new ArrayList<Epproduct>();
//		SessionFactory sf = null;
//		try
//		{
//			sf = new Configuration().configure().buildSessionFactory();
//		} catch (Throwable e)
//		{
//			System.err.println("Configuration sf GG" + e.getMessage());
//			throw new ExceptionInInitializerError(e);
//		}
//
//		Session s = sf.openSession();
//		Transaction ts = null;
//		try
//		{
//			ts = s.beginTransaction();
//			list = (List<Epproduct>) s.createQuery("from Epproduct").list();
//			ts.commit();
//			return list;
//		} catch (Exception e)
//		{
//			if (ts != null)
//			{
//				ts.rollback();
//				System.err.println("commit GG" + e.getMessage());
//			}
//			e.printStackTrace();
//			System.err.println("WTF GG" + e.getMessage());
//		} finally
//		{
//			s.close();
//			sf.close();
//		}
//		return list;
//	}

	@RequestMapping("/cart")
	public String cart(ModelMap model)
	{
		System.out.println("IndexController cart OK");
		return "my/cart";
	}
}
