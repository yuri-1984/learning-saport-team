package com.example.domain;

/**
 * 講師のエンティティクラス.
 * 
 * @author hiraokayuri
 *
 */
public class Instructor {
	/** ID */
	private Integer id;
	/** 氏名 */
	private String name;
	/** カナ */
	private String kana;
	/** メールアドレス */
	private String email;
	/** パスワード */
	private String password;
	/** 所属 */
	private String affiliation;
	/** 備考 */
	private String remarks;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
		return "Instructor [id=" + id + ", name=" + name + ", kana=" + kana + ", email=" + email + ", password="
				+ password + ", affiliation=" + affiliation + ", remarks=" + remarks + "]";
	}
	
	
	

}
