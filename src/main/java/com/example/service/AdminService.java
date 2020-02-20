package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Admin;
import com.example.repository.AdminRepository;

/**
 * 運営管理者情報を操作するサービスクラス.
 * 
 * @author hiraokayuri
 *
 */
@Service
@Transactional
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	
	/**
	 * 運営管理者の情報を新規登録する.
	 * @param admin
	 */
	public void registerAdmin(Admin admin) {
		adminRepository.InsertAdmin(admin);

	}
	
	/**
	 * 運営管理者を登録する際に既に登録されているメールアドレスかどうか確認する.
	 * 
	 * @param 
	 * @return existedAdmin 運営管理者情報　or null
	 */
	public Admin findByEmail(String email) {
		Admin admin = adminRepository.findByMailAddressAndPassward(email);
		return admin;
	}
	
	/**
	 * 運営管理者の情報を全件検索する.
	 * 
	 * @return adminList 運営管理者リスト
	 */
	public List<Admin> showList(){
		List<Admin> adminList = adminRepository.findAll();
		return adminList;
	}
	
	
}
