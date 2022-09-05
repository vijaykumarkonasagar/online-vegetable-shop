package com.onlinevegetableshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinevegetableshopping.model.Cart;
import com.onlinevegetableshopping.model.FeedBack;
import com.onlinevegetableshopping.model.RaiseComplaint;
import com.onlinevegetableshopping.model.User;
import com.onlinevegetableshopping.model.Vegetable;
import com.onlinevegetableshopping.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userServe;
	
	/*
	 *  Controller for the requests related to the Feedback
	 */	
	
	//requests the controller to give Feedback
	
	
	 //http://localhost:8091/onlinevegetableshopping/user/givefeedback
	
	@PostMapping("/feedback") 
	public ResponseEntity<FeedBack> giveFeedback(@RequestBody FeedBack feedback)
	{
	userServe.giveFeedBack(feedback);
		return new ResponseEntity("Feedback Recorded",HttpStatus.OK);
		
	}
	
	/*
	 *  Controller for the requests related to the vegetable store
	 */	
	//requests the controller to view all vegetables

	//http://localhost:8091/onlinevegetableshopping/user/allveg

	@GetMapping("/allveg") 
	public ResponseEntity<List<Vegetable>> viewAllveg()
	{
		List<Vegetable> viewVeg = userServe.viewAllVegtable();
		
		return  new ResponseEntity<List<Vegetable>>(viewVeg, HttpStatus.OK);
		
	}
	
	/*
	 *  Controller for the requests related to the cart
	 */
	
	//requests the controller to add vegetables to Cart

	//http://localhost:8091/onlinevegetableshopping/user/addVegtocart
	
	@PostMapping("/addVegtocart") 
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart)
	{
		Cart carts= userServe.addvegetableToCart(cart);
		return new ResponseEntity(carts, HttpStatus.OK) ;
		
	}
	
	//requests the controller to view Cart
	
	//http://localhost:8091/onlinevegetableshopping/user/viewcart
	
	@GetMapping("/viewcart")
	public ResponseEntity<List<Cart>> viewCart()
	{
		List<Cart> viewAddCart = userServe.viewCart();
		return new ResponseEntity<List<Cart>>(viewAddCart, HttpStatus.OK);
		
	}
	
	//requests the controller to delete vegetable by id in cart 

	//http://localhost:8091/onlinevegetableshopping/user/deletebyvegid
	
	@DeleteMapping("/deletebyvegid/{veg_id}")
	public ResponseEntity<Cart> deleteById(@PathVariable("veg_id") Integer veg_id)
	{
		userServe.deleteVegetablebyId(veg_id);
		return new ResponseEntity("Successfully deleted from cart ", HttpStatus.OK);
		
	}

	/*
	 *  Controller for the requests related to the raiseCompliant
	 */
	
	//requests the controller to raise Compliant

	
	//http://localhost:8091/onlinevegetableshopping/user/raise
	@PostMapping("/raise")
	public ResponseEntity<RaiseComplaint> raiseCompliant(@RequestBody RaiseComplaint raisecompliant)
	{
		userServe.raiseCompliant(raisecompliant);
		return new ResponseEntity("Compliant is Raised successfully", HttpStatus.OK);
		
	}
	
	
	
	
	
}

