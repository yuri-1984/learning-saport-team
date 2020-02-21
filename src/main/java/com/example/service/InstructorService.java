package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.repository.InstructorRepository;

/**
 * 講師の情報を操作するサービスクラス.
 * 
 * @author hiraokayuri
 *
 */
@Service
@Transactional
public class InstructorService {
	
	@Autowired
	private InstructorRepository instructorRepository;
	
	

}
