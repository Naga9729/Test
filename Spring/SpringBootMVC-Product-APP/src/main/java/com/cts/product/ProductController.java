package com.cts.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@Autowired
	private ProductDaoImpl dao;

	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	@RequestMapping("/loadForm")
	public String loadForm() {
		return "form";
	}

	@RequestMapping("/saveProduct")
	public ModelAndView saveProduct(@ModelAttribute Product product) {

		dao.saveProduct(product);

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Product " + product.getName() + " saved to DB");
		mav.setViewName("redirect:/listAll");

		return mav;

	}

	// load findProduct Form

	@RequestMapping("/loadFindProduct")
	public String laodFindProduct() {
		return "findproduct";
	}

	// edit product -> find

	@RequestMapping("/loadUpdateForm")
	public ModelAndView loadUpdateForm(@RequestParam("id") String id) {
		Product prod = dao.findById(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("updateform");
		mav.addObject("product", prod);

		return mav;
	}

	
	// remove Product
	@RequestMapping("removeProduct")
	public String removeProduct(@RequestParam("id") String id) {
		dao.deleteProduct(id);
		return "redirect:/listAll";
	}
	// updateProduct to DB
	@RequestMapping("updateProduct")
	public String updateProduct(@ModelAttribute Product prod) {
		dao.updateProduct(prod);
		return "redirect:/listAll";
	}

	// find a product
	@RequestMapping("/findById")
	public ModelAndView findById(@RequestParam("id") String id) {

		ModelAndView mav = new ModelAndView();

		Product prod = dao.findById(id);

		String url = null;
		if (prod != null) {
			url = "product";
			mav.addObject("product", prod);
		} else {
			url = "findproduct";
			mav.addObject("msg", "Product id " + id + " doesnt Exists in DB");
		}

		mav.setViewName(url);

		return mav;

	}

	// Listing all Products
	@RequestMapping("/listAll")
	public ModelAndView listAll() {
		ModelAndView mav = new ModelAndView();

		mav.setViewName("products");
		List<Product> prods = dao.listAll();
		mav.addObject("myProds", prods);

		return mav;

	}

}
