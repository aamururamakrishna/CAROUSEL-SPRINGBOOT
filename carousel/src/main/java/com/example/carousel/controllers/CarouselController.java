package com.example.carousel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.carousel.models.Carousel;
import com.example.carousel.services.CarouselRepository;

@Controller
@RequestMapping("/carousel")
public class CarouselController {

	@Autowired
	private CarouselRepository repo;
	
	@GetMapping({" ", "/"})
	public String  showCarouselList(Model model) {
		List<Carousel> carousel =repo.findAll();
		model.addAttribute("carousel", carousel);
		return "carousel/index";
	}
	
}
