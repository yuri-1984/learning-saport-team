package com.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Instructor;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Sql("/create.sql")
class InstructorServiceTest {
	@Autowired
	InstructorService service;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private RowMapper<Instructor> rowMapper = new BeanPropertyRowMapper<Instructor>(Instructor.class);
	private final String selectSql = "SELECT id,name,kana,email,password,affiliation,remarks FROM instructors";

	@Test
	void idの情報がないinstructorを渡したら4件情報が返ってくる() {
		Instructor expected = new Instructor();
		expected.setName("山田太郎");
		expected.setKana("ヤマダタロウ");
		expected.setEmail("yamadatarou@yahoo.co.jp");
		expected.setPassword("yamada0000");
		expected.setAffiliation("ラクスパートナーズ");
		expected.setRemarks("前職は介護職でした");
		service.addInstructor(expected);
		List<Instructor> actualInsertList = jdbcTemplate.query(selectSql, rowMapper);
		assertThat(actualInsertList).hasSize(4);

	}

	@Test
	void idのある情報のinstructorを渡したら更新される() {
		Instructor expected = new Instructor();
		expected.setId(1);
		expected.setName("山田太郎");
		expected.setKana("ヤマダタロウ");
		expected.setEmail("yamadatarou@yahoo.co.jp");
		expected.setPassword("yamada0000");
		expected.setAffiliation("ラクスパートナーズ");
		expected.setRemarks("前職は介護職でした");
		service.addInstructor(expected);
		Instructor actualUpdate = jdbcTemplate.queryForObject(selectSql + " where id = 1", rowMapper);
		assertThat(actualUpdate.getName(), is(expected.getName()));

	}
	
	@Test
	void 値が３件返ってくる() {
		List<Instructor> actualList = service.searchData();
		assertThat(actualList).hasSize(3);
		
	}
	@Test
	void 同じIDの値が1件返ってくる(){
		Instructor actual = service.searchOne(1);
		assertThat("actual",is(notNullValue()));
	}
	@Test
	void IDを指定したらnullが返ってくる() {
		service.removeInstructor(1);
		Instructor actual = jdbcTemplate.queryForObject(selectSql + " where id = 1", rowMapper);
		assertNull(actual);
	}
	

}
