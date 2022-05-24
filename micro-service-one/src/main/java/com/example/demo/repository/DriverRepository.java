package com.example.demo.repository;

import java.util.List;

import java.util.Optional;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Driver;


public interface DriverRepository extends JpaRepository<Driver, Integer> {
	
	
	List<Driver> findByDriverName(String srchName);//it is a correct form
	
	//List<Driver> findByFirstName(String srchName);
	
	List<Driver> findByMobileNumber(long mobileNumber);
	
	
	@Query(value="from Driver where rating=:srchValue")
	List<Driver> searchByRating(@Param("srchValue") double rating);
	
	@Query(value="update Driver set rating=:updatedRating where driverId=:srchId")
	@Modifying
	@Transactional
	int modifyRating(@Param("srchId")int driverId,@Param("updatedRating")double updatedRating);//indicate row updated so we are using int

}
