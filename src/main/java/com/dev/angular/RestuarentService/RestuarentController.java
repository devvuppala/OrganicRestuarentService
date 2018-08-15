package com.dev.angular.RestuarentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restuarent")
@CrossOrigin
public class RestuarentController {
	
	@Autowired
	MenuRepository menuRepository;
	
	@RequestMapping("/getAllMenuItems")
	public List<MenuItem> getAllMenuItems() {
		return menuRepository.findAll();		
	}

	@PostMapping("/saveMenuItem")
	public MenuItem getAllMenuItems(@RequestBody MenuItem menuItem) {
		return menuRepository.save(menuItem);		
	}
	
	@DeleteMapping("/deleteMenuItem/{itemID}")
	public String deleteMenuItem(@PathVariable(value = "itemID") Integer itemID) {
		MenuItem item = menuRepository.findByItemID(itemID);
		menuRepository.delete(item);
		return "deleted";
	}
	
	@PutMapping("/updateMenuItem")
	public MenuItem updateManuItem(@RequestBody MenuItem menuItem) {
		return menuRepository.save(menuItem);		
	}
}
