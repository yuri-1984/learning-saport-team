package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Admin;

/**
 * 運営管理者の情報を操作するリポジトリクラス.
 * @author hiraokayuri
 *
 */
@Repository
public class AdminRepository {
	
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private final static RowMapper<Admin> ADMIN_ROW_MAPPER = (rs,i)->{
		Admin admin = new Admin();
		admin.setId(rs.getInt("id"));
		admin.setName(rs.getString("name"));
		admin.setKana(rs.getString("kana"));
		admin.setEmail(rs.getString("email"));
		admin.setPassword(rs.getString("password"));
		admin.setCanShowAllCompany(rs.getBoolean("can_show_all_company"));
		return admin;
	};
	
	private final String SQL = "SELECT id,name,kana,email,password,can_show_all_company FROM admins";
	
	
	
	/**
	 * 運営管理者の情報を新規登録する.
	 * 
	 * @param admin 新規管理者情報
	 */
	public void InsertAdmin(Admin admin) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(admin);
		String sql = "INSERT INTO admins(name,kana,email,password,can_show_all_company)VALUES(:name,:kana,:email,:password,:canShowAllCompany)";
		template.update(sql,param);
		
	}
	
	/**
	 * 運営管理者のメールアドレス重複チェック.
	 * 
	 * @param email
	 * @param password
	 * @return 運営管理者情報　または、　null.
	 */
	public Admin findByMailAddressAndPassward(String email){
		String sql =SQL+ " where email=:email";
		SqlParameterSource param = new MapSqlParameterSource().addValue("email", email);
		List <Admin> adminList = template.query(sql, param,ADMIN_ROW_MAPPER);
		if(adminList.size() == 0) {
			return null;
		}
		return adminList.get(0);
		
	}
	/**
	 * 運営管理者を全件検索する.
	 * 
	 * @return adminList 運営管理者.
	 */
	public List<Admin> findAll(){
		String sql = SQL +" ORDER BY id";
		List<Admin> adminList = template.query(sql, ADMIN_ROW_MAPPER);
		if(adminList.size()== 0) {
			return null;
		}
		return adminList;
	}

}
