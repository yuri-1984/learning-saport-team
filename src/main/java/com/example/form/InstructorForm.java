package com.example.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 講師のフォームクラス.
 * 
 * @author hiraokayuri
 */
public class InstructorForm {
	/** 氏名 */
	@NotBlank(message="*お名前を入力して下さい")
	private String name;
	/** カナ */
	@NotBlank(message="*お名前を入力して下さい")
	private String kana;
	/** メールアドレス */
	@NotBlank(message="*メールアドレスを入力して下さい")
	@Email(message="*アドレスが不正です")
	private String email;
	/** パスワード */
	@Pattern(regexp ="[a-zA-Z0-9]*",message="*パスワードは英数字8桁以上で設定してください")
	@NotBlank(message="*パスワードを入力して下さい")
	private String password;
	/** 所属 */
	@NotBlank(message="所属名を記入してください")
	private String affiliation;
	/** 備考 */
	private String remarks;
	
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
	public String getAffiliation() {
		return affiliation;
	}
	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "InstructorForm [name=" + name + ", kana=" + kana + ", email=" + email + ", password=" + password
				+ ", affiliation=" + affiliation + ", remarks=" + remarks + "]";
	}
	
	

}
