package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.DonorDTO;

import com.example.demo.entity.DonorDetails;
import com.example.demo.entity.PatientDetails;



@RestController
@RequestMapping(path="/client")
public class DonorClientController {

	@Autowired
	private RestTemplate template;
	
	@Autowired
	private DonorDTO dto;
	
	
	
	@GetMapping(path = "/patient/donars/bloodgroup/{bloodGroup}")
	public DonorDTO getPatientDonorJson(@PathVariable("bloodGroup") String bloodGroup) {
		
		 DonorDetails[] donarList=this.template.getForObject("http://DONOR-SERVICE/api/v1/donars/srch/bloodgroup/"+bloodGroup, DonorDetails[].class);
		 
		 
		PatientDetails[] patient =this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/srch/bloodgroup/"+bloodGroup, PatientDetails[].class);
		
		Set<DonorDetails> donorSet=Arrays.stream(donarList).collect(Collectors.toSet());
		Set<PatientDetails> patientList=Arrays.stream(patient).collect(Collectors.toSet());
		
		dto.setDonorSet(donorSet);
		
		dto.setPatientList(patientList);
		
		return dto;

	
}
	
	@GetMapping(path="/srch/patient/donars/bloodgroup/{bloodGroup}")
	
	public String getPatientDonor(@PathVariable("bloodGroup") String bloodGroup) {
		
		String donorList=this.template.getForObject("http://DONOR-SERVICE/api/v1/donars/srch/bloodgroup/"+bloodGroup,String.class);
		
		String patient=this.template.getForObject("http://PATIENT-SERVICE/api/v1/patients/srch/bloodgroup/"+bloodGroup,String.class);
		
		return patient+donorList;
	}
	


	
}
	


