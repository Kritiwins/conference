package com.springdemo.service;

import java.util.List;

import com.springdemo.model.Speaker;
import com.springdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springdemo.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public List<Speaker> findAll() {
		return repository.findAll();
		
	}
	
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		// TODO Auto-generated constructor stub
		repository = speakerRepository;
	}
		
	public SpeakerRepository getRepository() {
		return repository;
	}

	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}

}
