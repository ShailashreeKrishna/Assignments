package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Seminar;

public interface SeminarRepository extends JpaRepository<Seminar, Integer> {

}
