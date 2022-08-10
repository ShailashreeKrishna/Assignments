package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.DonorDetails;

public interface DonorRepository extends JpaRepository<DonorDetails, Integer> {
	
	    @Query(value="update DonorDetails set location=:loc where donorId=:id")
	    @Modifying
	    @Transactional
	    int modifyLocation(@Param("id")int  donorId,@Param("loc") String location);
	    DonorDetails[] findByDonorId(int id);
	    
	    DonorDetails[] findByBloodGroup(String bloodGroup);
	    
	    DonorDetails save(DonorDetails entity);

}
