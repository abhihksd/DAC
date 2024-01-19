package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.ContactDAO;
import entities.Contact;
@Transactional
@Controller
public class ContactController {
	@Autowired
	ContactDAO cdao;
	
	@RequestMapping("/all")
	public ModelAndView getAllContacts()
	{
		List<Contact> clist=cdao.getAll();
		return new ModelAndView("all","clist",clist);
	}
	@RequestMapping("/create")
	public ModelAndView showfrom()
	{
		return new ModelAndView("contactForm","con",new Contact());
	}
	@RequestMapping("/save")
	public ModelAndView saveContact(@ModelAttribute("con")  Contact contact)
	{
		int cid=cdao.save(contact);
		return new ModelAndView("success","cid",cid);
				
	}
	@RequestMapping("/edit")
	public ModelAndView getEdit(@RequestParam("cid") int n)
	{
		Contact con=cdao.getOne(n);
		return new ModelAndView("editcontact","econ",con);
	}

	@RequestMapping("/update")
	public ModelAndView updateContact(@ModelAttribute("econ") Contact ct )
	{
		cdao.update(ct);
		return new ModelAndView("success");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteContact(@ModelAttribute("econ") Contact ct )
	{
		cdao.delete(ct);
		return new ModelAndView("all");
	}

}
