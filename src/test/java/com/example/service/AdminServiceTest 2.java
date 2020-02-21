package com.example.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Admin;
import com.example.repository.AdminRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@Sql("classpath:/create.sql")
class AdminServiceTest {
	@Autowired
	AdminService adminService;
	@Autowired
	AdminRepository adminRepository;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void 同じEmailの情報を持ってくる() {
		Admin actual1 = adminService.findByEmail("yur0427jp@yahoo.co.jp");
		assertNotNull(actual1);
	}
	@Test
	public void 違う値を入れたらnullで返ってくる() {
		Admin actual = adminService.findByEmail("hira@yahoo.co.jp");
		assertNull(actual);
	}
	@Test
	public void 全件検索したら3件返ってくる() {
		List<Admin> actualList = adminService.showList();
		assertThat(actualList).hasSize(3);
	}

}
