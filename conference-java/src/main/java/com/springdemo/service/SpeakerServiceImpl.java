package com.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdemo.model.Speaker;
import com.springdemo.repository.HibernateSpeakerRepositoryImpl;
import com.springdemo.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public List<Speaker> findAll() {
		return repository.findAll();
		
	}
	
	public SpeakerServiceImpl() {
		System.out.println("No args constructor");
	}
	
	@Autowired
	public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
		// TODO Auto-generated constructor stub
		System.out.println("args constructor");
		repository = speakerRepository;
	}
		
	public SpeakerRepository getRepository() {
		return repository;
	}

	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("Speaker Repo Setter");
		this.repository = repository;
	}

}
