package com.rkatanor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rkatanor.model.Benefit;
import com.rkatanor.service.BenefitService;

@RestController
@RequestMapping("/rest")
public class BenefitController {
	@Autowired
	BenefitService service;

	@GetMapping("/savebenefit")
	public Benefit persistBenefit(@RequestParam("id") Integer id, @RequestParam("name") String name,
			@RequestParam("type") String type, @RequestParam("cost") String cost,
			@RequestParam("provider") String provider) {
		Benefit b = new Benefit();
		b.setBenefit_id(id);
		b.setBenefit_name(name);
		b.setBenefit_type(type);
		b.setBenefit_cost(cost);
		b.setBenefit_provider(provider);
		service.saveBenefit(b);
		return b;
	}

	@PostMapping("/postbenefit")
	public Benefit saveBenefit(@RequestBody Benefit b) {
		return service.saveBenefit(b);
	}
	@GetMapping("/pullbenefits")
	public List<Benefit> getBenefits(){
		return service.getBenefits();
	}
	@GetMapping(value="/getname")
	public String name() {
		return "this is a producer for benefit..";
	}
}
