package com.example.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 運営管理者のフォームクラス.
 * 
 * @author hiraokayuri
 *
 */
public class AdminForm {	
	/** 氏名　*/
	@NotBlank(message="*お名前を入力して下さい")
	private String name;
	/** かな　*/
	@NotBlank(message="*お名前を入力して下さい")
	private String kana;
	/** メールアドレス　*/
	@NotBlank(message="*メールアドレスを入力して下さい")
	@Email(message="*アドレスが不正です")
	private String email;
	/** パスワード　*/
	@Pattern(regexp ="[a-zA-Z0-9]*",message="*パスワードは英数字8桁以上で設定してください")
	@NotBlank(message="*パスワードを入力して下さい")
	private String password;
	/** 確認用パスワード　*/
	@NotBlank(message="*確認用パスワードを入力して下さい")
	private String confirmationPassword;
	/** 全ての企業情報が見れるか　*/
	private String canShowAllCompany;
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
	public String getConfirmationPassword() {
		return confirmationPassword;
	}
	public void setConfirmationPassword(String confirmationPassword) {
		this.confirmationPassword = confirmationPassword;
	}
	public String getCanShowAllCompany() {
		return canShowAllCompany;
	}
	public void setCanShowAllCompany(String canShowAllCompany) {
		this.canShowAllCompany = canShowAllCompany;
	}
	@Override
	public String toString() {
		return "AdminForm [name=" + name + ", kana=" + kana + ", email=" + email + ", password=" + password
				+ ", confirmationPassword=" + confirmationPassword + ", canShowAllCompany=" + canShowAllCompany + "]";
	}
	

}
