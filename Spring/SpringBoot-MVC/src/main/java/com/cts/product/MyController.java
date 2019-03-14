package com.cts.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/s1")
	public void f1() {
		System.out.println("------ MyController f1 method");
	}

	@RequestMapping("/s2")
	public void f2() {
		System.out.println("--- Thsi is my f2 method");
	}

	@RequestMapping("/s3")
	public String f3() {
		System.out.println("--- This is f3 method");
		return "one";
	}

	@RequestMapping("/s4")
	public String f4(Model model) {
		System.out.println("--- This is f4 method");
		// DB code
		String userName = "Praveen Reddy S";
		model.addAttribute("uname", userName);
		return "two";
	}

	@RequestMapping("/s5")
	public ModelAndView f5() {
		
		// JSTL -> JSP Standard Tag Library
		System.out.println("--- This is f5 method");
		
		String cities[]= {"Chennai","Bangalore","Hyderabad","Pune"};
		
		Product prod=new Product();
		prod.setId("P001");
		prod.setName("Pen");
		prod.setPrice(6664);
		prod.setDescription("Red Ink");
		
		
		
		
		String userName = "Ozvitha";
		ModelAndView mav = new ModelAndView();
		mav.setViewName("thr");
		mav.addObject("uname", userName);
		mav.addObject("product",prod);
		mav.addObject("myCities",cities);
		
		
		
		
		

		return mav;
	}

}
