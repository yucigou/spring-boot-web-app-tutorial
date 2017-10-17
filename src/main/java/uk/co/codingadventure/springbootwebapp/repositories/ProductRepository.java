package uk.co.codingadventure.springbootwebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import uk.co.codingadventure.springbootwebapp.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
}