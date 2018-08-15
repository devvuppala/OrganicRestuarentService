package com.dev.angular.RestuarentService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository<MenuItem, Integer>{

	public MenuItem findByItemID(Integer itemID);

}
