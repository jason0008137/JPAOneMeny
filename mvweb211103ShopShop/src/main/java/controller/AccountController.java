package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Account;

@Controller
public class AccountController
{
//	@RequestMapping("/acc")
	@RequestMapping(value = "/acc", produces = "application/text;charset=utf8")
	@ResponseBody
	public List<Account> generateAccount(Model m)
	{
		List<Account> list = new ArrayList<Account>();
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
			list = (List<Account>) s.createQuery("from Account").list();
			ts.commit();
			return list;
		} catch (Exception e)
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
		return list;
	}

	@RequestMapping("/check")
	@ResponseBody
	public String checkAccount(@ModelAttribute("account") Account acc)
	{
		String str = "DUM";

		List<Account> list = new ArrayList<Account>();
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
			list = (List<Account>) s.createQuery("from Account").list();
			ts.commit();

			System.out.print("AAAAAAAAA:" + acc.getName() + "\t" + acc.getPw());

			for (Account account : list)
			{
				if (account.getName().equals(acc.getName()) && account.getPw().equals(acc.getPw()))
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
}
