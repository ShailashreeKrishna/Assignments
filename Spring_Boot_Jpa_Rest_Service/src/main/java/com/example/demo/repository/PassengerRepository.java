package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Passenger;
import com.example.demo.entity.TripHistory;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
	
	public List<Passenger> findByPassengerName(String passName);
	
    public List<Passenger> getByTripListTripDateTime(LocalDateTime date);
    
    
    @Query(value="update Passenger set location=:loc where passengerId=:id")
    @Modifying
    @Transactional
    int modifyLocation(@Param("id")int  passengerId,@Param("loc") String location);
}
