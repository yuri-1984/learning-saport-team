package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Instructor;
import com.example.form.InstructorForm;
import com.example.service.InstructorService;

/**
 * 講師の情報を操作するコントローラークラス.
 * 
 * @author hiraokayuri
 *
 */
@Controller
@RequestMapping("/instructor")
public class InstructorController {
	@Autowired
	private InstructorService instructorService;
	
	@ModelAttribute
	public InstructorForm setUpInstructorForm() {
		return new InstructorForm();
		
	}
	
	/**
	 * 講師の一覧を表示させるだけのメソッド.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("/toInstructorList")
	public String toRegisterList(Model model) {
		List<Instructor>instructorList = instructorService.searchData();
		model.addAttribute("instructorList", instructorList);
		return "admin/instructor_list";
		
	}
	
	

}
