package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Shree_seminar_one_to_one")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Seminar {
	@Id
	@Column(name="Seminar_Id")
	int id;
	
	@Column(name="Seminar_name")
	String name;
	
	@Column(name="Duration")
	int duration;

	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="speaker_ref")
	
	private Speaker speaker;
}
