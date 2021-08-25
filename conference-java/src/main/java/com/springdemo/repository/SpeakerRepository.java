package com.springdemo.repository;

import java.util.List;

import com.springdemo.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}