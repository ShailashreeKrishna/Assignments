package com.example.demo.dto;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;
import com.example.demo.entity.DonorDetails;
import com.example.demo.entity.PatientDetails;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level=AccessLevel.PRIVATE)

public class DonorDTO {

	private Set<PatientDetails> patientList;
	
	private Set<DonorDetails>  donorSet;
}
