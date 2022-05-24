package com.example.demo.repository.bidirectional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.entity.bidirectional.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
