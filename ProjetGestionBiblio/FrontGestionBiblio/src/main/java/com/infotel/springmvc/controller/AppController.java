package com.infotel.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infotel.gestionbiblio.service.inter.BookService;

@Controller
@Transactional
public class AppController {
	@Autowired
	@Qualifier("bookServiceImpl")
	BookService bookService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) 
	{

		return "home";
	}

	@RequestMapping(value = { "/products" }, method = RequestMethod.GET)
	public String productsPage(ModelMap model) 
	{
		model.addAttribute("books", bookService.getBookRecommandes());
		//System.out.println(bookService.getBookRecommandes());

		return "products";
	}
	

	@RequestMapping(value = { "/products" }, method = RequestMethod.POST)
	public String productsRecherchePage(HttpServletRequest request, ModelMap model) 
	{
		String search = request.getParameter("search");
		model.addAttribute("books", bookService.getBookByRecherche(search));
System.out.println(search);
		return "products";
	}

	/*@RequestMapping(value = { "/products/auteur" }, method = RequestMethod.GET)
	public String productsAuteurPage(ModelMap model) 
	{
		model.addAttribute("books", bookService.getBookByAuthor());
		return "products";
	}*/

	@RequestMapping(value = { "/compte" }, method = RequestMethod.GET)
	public String comptePage(ModelMap model) 
	{
		return "compte";
	}

	@RequestMapping(value = { "/deconnexion" }, method = RequestMethod.GET)
	public String deconnexionPage(ModelMap model) 
	{

		return "deconnexion";
	}

	@RequestMapping(value = { "/gestioncompte" }, method = RequestMethod.GET)
	public String gestionComptePage(ModelMap model) 
	{

		return "gestioncompte";
	}

	@RequestMapping(value = { "/inscription" }, method = RequestMethod.GET)
	public String inscriptionPage(ModelMap model) 
	{

		return "inscription";
	}

	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String loginPage(ModelMap model) 
	{

		return "login";
	}
}