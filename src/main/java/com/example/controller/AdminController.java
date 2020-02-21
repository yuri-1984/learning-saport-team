package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Admin;
import com.example.form.AdminForm;
import com.example.service.AdminService;

/**
 * 運営管理者の情報を操作するコントローラークラス.
 * 
 * @author hiraokayuri
 *
 */
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@ModelAttribute
	public AdminForm setUpAdminForm() {
		return new AdminForm();
	}
	
	/**
	 * 運営管理者の一覧を表示させるだけのメソッド.
	 * 
	 * @return 運営管理者の一覧ページ.
	 */
	@RequestMapping("/toAdminList")
	public String toRegisterList(Model model) {
		List<Admin> adminList = adminService.showList();
		
		
		
		model.addAttribute("adminList", adminList);
		return "admin/facility_manager_list";
	}

	/**
	 * 運営管理者の登録ページをただ表示させるだけのメソッド.
	 * 
	 * @return facility_manager_detail 運営管理者の登録ページ.
	 */
	@RequestMapping("/toAdminRegiste")
	public String toAdminRegister() {
		return "admin/facility_manager_detail";
	}
	/**
	 * 運営管理者の情報を編集するページ
	 * @return　facility_manager_edit 運営管理者の変更ページ
	 */
	@RequestMapping("/toAdminEdit")
	public String toAdminEdit() {
		return "admin/facility_manager_edit";
		
	}

	/**
	 * 運営管理者情報を新規登録する.
	 * 
	 * @param adminForm
	 * 
	 * @return 管理者情報一覧ページ .
	 */
	@RequestMapping("/addAdmin")
	public String addAdmin(@Validated AdminForm adminForm, BindingResult result) {
		
		// メールアドレスが重複しているかどうか
		if (adminService.findByEmail(adminForm.getEmail()) != null) {
			result.rejectValue("email", "", "*既に登録されているメールアドレスです");
		}
		// パスワードが一致しているかどうか
		if (!adminForm.getPassword().equals(adminForm.getConfirmationPassword())) {
			result.rejectValue("password", "", "パスワードが一致していません");
			result.rejectValue("confirmationPassword", "", "");
		}
		if (result.hasErrors()) {
			return toAdminRegister();
		}

//		フォームから値を受け取ってAdminに値を入れる.企業リストは登録した後にIDをリターンで返す?
		Admin admin = new Admin();
		admin.setName(adminForm.getName());
		admin.setKana(adminForm.getKana());
		admin.setEmail(adminForm.getEmail());
		admin.setPassword(adminForm.getPassword());
		if (adminForm.getCanShowAllCompany() == "0") {
			admin.setCanShowAllCompany(true);
		} else {
			admin.setCanShowAllCompany(false);
			
		}

		adminService.registerAdmin(admin);
		return "admin/facility_manager_list";

	}
	
	public String upDateAdmin(@Validated AdminForm adminFrom) {
		
		return toAdminRegister();
	}
	

}
