package com.infotel.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.infotel.gestionbiblio.entity.Member;
import com.infotel.gestionbiblio.service.inter.*;

@Controller
@Transactional
public class AppController {
	@Autowired
	@Qualifier("bookServiceImpl")
	BookService bookService;
	
	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService memberService;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String homePage(HttpServletRequest request,ModelMap model) 
	{
		model.addAttribute("titrePage","LES LIVRES RECOMMANDES");
		model.addAttribute("sousTitrePage","# Les livres populaires recommandés");
		model.addAttribute("books", bookService.getBookRecommandes());
		
		return "products";
	}

	@RequestMapping(value = { "/products" }, method = RequestMethod.GET)
	public String productsPage(HttpServletRequest request,ModelMap model) 
	{
		model.addAttribute("titrePage","LISTE DE TOUS LES LIVRES");
		model.addAttribute("sousTitrePage","# Tous les livres de la bibliothèque");
		model.addAttribute("books", bookService.getList());
		//System.out.println(bookService.getBookRecommandes());

		return "products";
	}
	

	@RequestMapping(value = { "/search" }, method = RequestMethod.GET)
	public String productsRecherchePage(HttpServletRequest request, ModelMap model) 
	{
		String search = request.getParameter("search");
		model.addAttribute("titrePage","LISTE DE LIVRES RECHERCHES");
		model.addAttribute("sousTitrePage","# Livres filtrés par recherche de : '"+search+"'");
		model.addAttribute("books", bookService.getBookByRecherche(search));

		return "products";
	}
	
	@RequestMapping(value = { "/inscription" }, method = RequestMethod.GET)
	public String productsInscriptionPage(HttpServletRequest request, ModelMap model) 
	{
		String nom = request.getParameter("nom");

		model.addAttribute("titrePage","CREATION DE COMPTE");
		model.addAttribute("sousTitrePage","# Formulaire de création de comptes");
		model.addAttribute("inscription",false);
		
		if(nom!=null)
		{
			String prenom = request.getParameter("prenom");
			String adresse = request.getParameter("adresse");
			String mail = request.getParameter("mail");
			String pwd = request.getParameter("pwd");
			String ville = request.getParameter("ville");
			String codePostal = request.getParameter("codePostal");
			String tel = request.getParameter("tel");
			
			Member nouveau = new Member(nom,prenom,mail,pwd,adresse,ville,codePostal,tel);
			
			memberService.insert(nouveau);
			
			model.addAttribute("inscription",true);
		
		}

		nom = null;
		
		return "inscription";
	}

	@RequestMapping(value = { "/compte" }, method = RequestMethod.GET)
	public String comptePage(HttpServletRequest request,ModelMap model) 
	{
		return "compte";
	}

	@RequestMapping(value = { "/deconnexion" }, method = RequestMethod.GET)
	public String deconnexionPage(HttpServletRequest request,ModelMap model) 
	{

		return "deconnexion";
	}

	@RequestMapping(value = { "/gestioncompte" }, method = RequestMethod.GET)
	public String gestionComptePage(HttpServletRequest request,ModelMap model) 
	{

		return "gestioncompte";
	}

	@RequestMapping(value = { "/panier" }, method = RequestMethod.GET)
	public String gestionBasketPage(HttpServletRequest request,ModelMap model) 
	{
		model.addAttribute("titrePage","VOTRE PANIER");
		model.addAttribute("sousTitrePage","# Liste de livre que vous voulez emprunter (limite de 3)");
		model.addAttribute("books", bookService.getBookRecommandes());
		
		return "panier";
	}
	
	@RequestMapping(value = { "/login" }, method = RequestMethod.GET)
	public String loginPage(HttpServletRequest request, ModelMap model) 
	{
		String email = request.getParameter("email");
		
		model.addAttribute("titrePage","CONNEXION");
		model.addAttribute("sousTitrePage","# Formulaire de connexion au compte");
		model.addAttribute("admin",false);
		
		if(email!=null)
		{
			String password = request.getParameter("password");

			/*Member member = memberService.getByLogin(email,password);
			

			if(member.isAdministrateur())
			{
				model.addAttribute("admin",true);
			}
			
			model.addAttribute("inscription",true);
		*/
		}

		return "login";
	}
}