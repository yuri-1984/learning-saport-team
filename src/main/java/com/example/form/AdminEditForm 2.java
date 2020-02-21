package com.example.form;

public class AdminEditForm {
	/** 氏名 */
	private String name;
	/** かな */
	private String kana;
	/** メールアドレス */
	private String email;
	/** パスワード */
	private String password;
	/** 確認用パスワード */
	private String confirmationPassword;
	/** 全ての企業情報が見れるか */
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
		return "AdminEditForm [name=" + name + ", kana=" + kana + ", email=" + email + ", password=" + password
				+ ", confirmationPassword=" + confirmationPassword + ", canShowAllCompany=" + canShowAllCompany + "]";
	}

}
