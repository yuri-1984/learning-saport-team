package com.example.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.verifyZeroInteractions;

import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
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
@Sql("/create.sql")
@Transactional
public class InstructorRepositoryTest {
	@Autowired
	private InstructorRepository instructorRepository;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Instructor> rowMapper = new BeanPropertyRowMapper<Instructor>(Instructor.class);
	
	private final String selectSql ="SELECT id,name,kana,email,password,affiliation,remarks FROM instructors";


	@Before
	public void setUp() throws Exception {
		
	}
		

	@After
	public void tearDown() throws Exception {
		instructorRepository.deleteInstructor(4);
	}
	@Test
	public void 登録したら４件返ってくる() {
		Instructor instructor0 = new Instructor();
		instructor0.setName("平岡優里");
		instructor0.setKana("ヒラオカユリ");
		instructor0.setEmail("yuri0427jp@yahoo.co.jp");
		instructor0.setPassword("0427yuri");
		instructor0.setAffiliation("ラクスパートナーズ");
		instructor0.setRemarks("残業ができません。");
		instructorRepository.save(instructor0);
		Map<String, Object> inst = jdbcTemplate.queryForMap(selectSql + " WHERE name ='平岡優里'");
		assertThat(inst.get("name"),is("平岡優里"));

	}
	

	
	@Test
	public void 講師の情報を更新したら同じ値が返ってくる() {
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("尾崎豊");
		instructor.setKana("オザキユタカ");
		instructor.setEmail("ozakijp@yahoo.co.jp");
		instructor.setPassword("ozaki0000");
		instructor.setAffiliation("ソニーミュージック株式会社");
		instructor.setRemarks("作曲しかできません");
		instructorRepository.save(instructor);
		Instructor actualUpdate = jdbcTemplate.queryForObject(selectSql + " WHERE name ='尾崎豊'",rowMapper);
		assertThat(actualUpdate.getName(),is(instructor.getName()));	
	}

	@Test
	public void 全件検索したら3件返ってくる() {
		List<Instructor>actualList = instructorRepository.findAll();
		assertThat(actualList).hasSize(3);
		
		
	}
	@Test
	public void IDを指定したら値が返ってくる() {
		Instructor actualdesu = instructorRepository.load(1);
		assertThat("actualdesu", is(notNullValue()));
		
	}
	
	public void IDを指定したらnullが返ってくる() {
		instructorRepository.deleteInstructor(1);
		Instructor actualDelete = (Instructor)jdbcTemplate.queryForMap(selectSql + "id =1");
		assertNull(actualDelete);
		
	}
	
	

}
