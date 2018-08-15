package com.dev.angular.RestuarentService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuItem, Integer>{

	public MenuItem findByItemID(Integer itemID);
	
	@Query("select dish from MenuItem dish where dish.itemPrice > :priveValue")
	public List<MenuItem> findMenusWithThePrice(@Param("priveValue") Float priveValue);
	

}
