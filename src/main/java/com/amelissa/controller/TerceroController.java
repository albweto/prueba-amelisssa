package com.amelissa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amelissa.model.terceros;
import com.amelissa.service.ITercerosService;
import com.amelissa.service.TerceroService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TerceroController {

	@Autowired
	private TerceroService service;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value = "list-all", method = RequestMethod.GET)
	public String showAll(ModelMap map) {
		map.put("terceros", service.getAll());
		return "list-all";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	 public String showAddPage(ModelMap model) {
        model.addAttribute("terceros", new terceros());
        return "todo";
    }
	
	@RequestMapping(value = "/delete-todo", method = RequestMethod.GET)
	public String deleteTercero(@RequestParam Long id) {
		service.deleteTercero(id);
		return "redirect:/list-all";
	}
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.GET)
	public String showUpdatePage(@RequestParam long id,ModelMap map) {
		terceros te = service.getTerceroById(id).get();
		map.put("terceros", te);
		return "todo";
	}
	
	@RequestMapping(value = "/update-todo", method = RequestMethod.POST)
	public String updateTercero(ModelMap map, @Validated terceros t, BindingResult result) {
		service.updateTerceros(t);
		 return "redirect:/list-all";
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String addTercero(ModelMap map, @Validated terceros t, BindingResult result) {
		service.saveTercero(t);
		 return "redirect:/list-all";
	}
	
}
