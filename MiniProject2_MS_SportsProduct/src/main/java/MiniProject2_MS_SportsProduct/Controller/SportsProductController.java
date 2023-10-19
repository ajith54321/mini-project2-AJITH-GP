package MiniProject2_MS_SportsProduct.Controller;

import java.util.List;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import MiniProject2_MS_SportsProduct.Entity.SportsProductEntity;
import MiniProject2_MS_SportsProduct.Repository.SportsProductRepository;
import jakarta.persistence.EntityNotFoundException;

@RestController
public class SportsProductController {
	
	@Autowired
	SportsProductRepository sc;
	

	@PostMapping("sps/addSportsProduct")
	public SportsProductEntity createuser(@RequestBody SportsProductEntity prod) {
		return sc.save(prod);
	}
	@GetMapping("sps/getSportsProducts")
	public List<SportsProductEntity> getJPQl(){
		return sc.findAll();
		}



	@PutMapping("sps//updateSport/{id}")

			public SportsProductEntity updatePurchase(@PathVariable int id, @RequestBody SportsProductEntity updatedProduct) {

		        Optional<SportsProductEntity> existingProduct = sc.findById(id);
			    if (existingProduct.isPresent()) {
			    	SportsProductEntity productToUpdate = existingProduct.get();


			        if (updatedProduct.getProduct_name() != null) {
			            productToUpdate.setProduct_name(updatedProduct.getProduct_name());


			        }

			        if (updatedProduct.getCost() != 0.0) {

			            productToUpdate.setCost(updatedProduct.getCost());

			        }
			        if (updatedProduct.getDecsription() != null) {

			            productToUpdate.setDecsription(updatedProduct.getDecsription());

			        }

			        return sc.save(productToUpdate);
			    } else {

	 

			        // Handle the case where the product with the given ID doesn't exist

	 

			        throw new EntityNotFoundException("Sports Product with ID " + id + " not found");

	 

			    }

	 

			}
		

	
	@DeleteMapping("sps/deleteSportsProduct/{id}")
	public void deleteUser(@PathVariable ("id") Integer id) {
		sc.deleteById(id);
	}


}
