package com.example.domain;

import java.util.List;

/**
 * 企業のエンティティクラス.
 * 
 * @author hiraokayuri
 *
 */
public class Company {
	/** ID */
	private Integer id;
	/** 企業名 */
	private String nama;
	/** かな */
	private String kana;
	/** 備考 */
	private String remarks;
	/** 企業担当者リスト */
	private List<CompanyMember> companyMemberList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public List<CompanyMember> getCompanyMemberList() {
		return companyMemberList;
	}
	public void setCompanyMemberList(List<CompanyMember> companyMemberList) {
		this.companyMemberList = companyMemberList;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", nama=" + nama + ", kana=" + kana + ", remarks=" + remarks
				+ ", companyMemberList=" + companyMemberList + "]";
	}
	
	

}
