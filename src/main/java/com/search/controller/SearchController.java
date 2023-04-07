package com.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping(path = "/home")
	public String home() {
		return "home";
	}

	@RequestMapping(path = "/search")
	public RedirectView search(@RequestParam("q") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView view = new RedirectView();
		view.setUrl(url);

		return view;
	}

}
