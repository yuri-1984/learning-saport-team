package com.example.form;

/**
 * 運営管理者のフォームクラス.
 * 
 * @author hiraokayuri
 *
 */
public class AdminForm {	
	/** 氏名　*/
	private String name;
	/** かな　*/
	private String kana;
	/** メールアドレス　*/
	private String email;
	/** パスワード　*/
	private String password;
	/** 全ての企業情報が見れるか　*/
	private  boolean canShowAllCompany;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKana() {
		return kana;
	}
	public void setKana(String kana) {
		this.kana = kana;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isCanShowAllCompany() {
		return canShowAllCompany;
	}
	public void setCanShowAllCompany(boolean canShowAllCompany) {
		this.canShowAllCompany = canShowAllCompany;
	}
	@Override
	public String toString() {
		return "AdminForm [name=" + name + ", kana=" + kana + ", email=" + email + ", password=" + password
				+ ", canShowAllCompany=" + canShowAllCompany + "]";
	}
	

}
