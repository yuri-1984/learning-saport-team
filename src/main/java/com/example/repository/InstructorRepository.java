package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Instructor;

/**
 * 講師の情報を操作するリポジトリ.
 * 
 * @author hiraokayuri
 *
 */
@Repository
public class InstructorRepository {
	//rowmapperの自動生成
	private RowMapper<Instructor> rowMapper = new BeanPropertyRowMapper<Instructor>(Instructor.class);
	

	@Autowired
	private NamedParameterJdbcTemplate template;

	private final String SQL = "SELECT id,name,kana,email,password,affiliation,remarks FROM instructors";
	private final String TABLE_NAME = "instructors";

	/**
	 * 渡した講師の情報を登録または、更新する.
	 * 
	 * @param instructor 1件の講師情報
	 */
	public void save(Instructor instructor) {
		SqlParameterSource param = new BeanPropertySqlParameterSource(instructor);
		if (instructor.getId() == null) {
			String insertSql = "INSERT INTO " + TABLE_NAME + " (name,kana,email,password,affiliation,remarks) VALUES (:name,:kana,:email,:password,:affiliation,:remarks)";
			template.update(insertSql, param);
		} else {
			String updateSql = "UPDATE " + TABLE_NAME + " SET name =:name,kana =:kana,email =:email,password =:password,affiliation =:affiliation,remarks =:remarks WHERE id =:id";
			template.update(updateSql, param);
		}
	}

	/**
	 * 講師の情報を全件検索.
	 * 
	 * @return instructorList 講師のリスト または null
	 */
	public List<Instructor> findAll() {
		String sql = SQL + " Order by id";
		List<Instructor> instructorList = template.query(sql,rowMapper);
		if (instructorList.size() == 0) {
			return null;
		}
		return instructorList;

	}
	
	/**
	 * 講師の情報を1件削除.
	 * @param id
	 */
	public void deleteInstructor(Integer id ) {
		String deleteSql = "DELETE FROM " + TABLE_NAME + " WHERE id=:id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		template.update(deleteSql, param);
		
	}
	/**
	 *　講師の情報を1件検索.
	 *
	 * @param id
	 * @return instructor 講師
	 */
	public Instructor load(Integer id) {
		String loadSql = SQL + " WHERE id=:id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		Instructor instructor = template.queryForObject(loadSql, param,rowMapper);
		return instructor;		
				
	}
	
	/**
	 * 検索された文字で曖昧検索を行います.
	 * @param name
	 * @return 講師情報の一覧
	 */
	public List<Instructor> findByName(String name){
		String IlikeSql = SQL +" WHERE name=:name";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", '%' + name + '%');
		return template.query(IlikeSql,param,rowMapper);
		
	}

}
