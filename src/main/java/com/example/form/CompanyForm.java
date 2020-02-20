package com.example.form;

/**
 * 企業のフォームクラス.
 * 
 * @author hiraokayuri
 *
 */
public class CompanyForm {
	/** 企業名 */
	private String nama;
	/** かな */
	private String kana;
	/** 備考 */
	private String remarks;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getKana() {
		return kana;
	}
	public void setKana(String kana) {
		this.kana = kana;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "CompanyForm [nama=" + nama + ", kana=" + kana + ", remarks=" + remarks + "]";
	}
	

}
