package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CalcBean;

@Controller
public class CalcController {

	@GetMapping("calc")
	public String CalcJSP() {
		return "Calc";
	}

	@PostMapping("calcadd")
	public String Calcadd(CalcBean bean, Model model) {

//        int add = bean.getN1() + bean.getN2();      
//        model.addAttribute("resultCalc", add);
//        	return "resultCalc";  

		Integer result = 0;
		String operator = bean.getOperation();

		switch (operator) {
		case "add":
			result = bean.getN1() + bean.getN2();
			break;
		case "subtract":
			result = bean.getN1() - bean.getN2();
			break;
		case "multiply":
			result = bean.getN1() * bean.getN2();
			break;
		}

		model.addAttribute("resultCalc", result);
		return "resultCalc";

	}

}
