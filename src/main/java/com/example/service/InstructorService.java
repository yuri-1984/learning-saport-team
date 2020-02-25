package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Instructor;
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
	
	
	/**
	 * 新規登録　もしくは　更新の登録を行う.
	 * 
	 * @param instructor 講師
	 */
	public void addInstructor(Instructor instructor) {
		instructorRepository.save(instructor);
	}
	
	
	/**
	 * 講師の情報を削除する.
	 * 
	 * @param id 主キー
	 */
	public void removeInstructor(Integer id) {
		instructorRepository.deleteInstructor(id);
		
	}
	
	/**
	 * 講師の情報を全件検索する.
	 * @return instructorlist 講師リスト
	 */
	public List<Instructor> searchData(){
		List<Instructor> instructorList = instructorRepository.findAll();
		return instructorList;
	}
	
	/**
	 * 講師の情報を1件検索する.
	 * 
	 * @param id
	 * @return instructor 1件の講師情報.
	 */
	public Instructor searchOne(Integer id) {
		Instructor instructor = instructorRepository.load(id);
		return instructor;
		
	}
	
	/**
	 * 曖昧検索を行う.
	 * 
	 * @param name
	 * @return 検索結果.
	 */
	public List<Instructor> searchByName(String name){
		return instructorRepository.findByName(name);
	}
	

}
