package uk.co.codingadventure.springbootwebapp.controllers;

import org.springframework.web.bind.annotation.RestController;

import uk.co.codingadventure.springbootwebapp.domain.Product;
import uk.co.codingadventure.springbootwebapp.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@Autowired
	private ProductRepository productRepository;
	
    @RequestMapping("/")
    public List<Product> index() {
    	List<Product> products = new ArrayList<>();
    	Iterable<Product> it = productRepository.findAll();
    	it.forEach(p -> {
    		System.out.println(p.getDescription());
    		products.add(p);
    	});
        return products;
    }

}