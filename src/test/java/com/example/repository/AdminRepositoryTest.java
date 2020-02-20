package com.example.repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Admin;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AdminRepositoryTest {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	private JdbcTemplate jdbcTemplate;
	

	@Test
	public void test() {
		Admin admin = new Admin();
		admin.setName("平岡");
		admin.setKana("ヒラオカユリ");
		admin.setPassword("yurihiraoka");
		admin.setEmail("yuri0427@yahoo.co.jp");
		admin.setCanShowAllCompany(true);
		adminRepository.InsertAdmin(admin);
		
		Map<String,Object>createdAdmin =
				jdbcTemplate.queryForMap("SELECT id, name, kana, password,email,can_show_all_company From admins WHERE name='平岡'");
		
		assertThat(createdAdmin.get("name"),is("平岡"));
		assertThat(createdAdmin.get("kana"),is("ヒラオカユリ"));
		assertThat(createdAdmin.get("password"),is("yurihiraoka"));
		assertThat(createdAdmin.get("email"),is("yuri0427@yahoo.co.jp"));
		assertThat(createdAdmin.get("can_show_all_company"),is(true));
		
		
	}

}
