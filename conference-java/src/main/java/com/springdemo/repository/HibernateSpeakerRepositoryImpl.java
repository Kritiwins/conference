package com.springdemo.repository;

import java.util.ArrayList;
import java.util.List;

import com.springdemo.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
public List<Speaker> findAll(){
		
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		
		speaker.setFirstName("Kritika");
		speaker.setLastName("Jaiswal");
		
		speakers.add(speaker);
		
		return speakers;
		
	}

}
