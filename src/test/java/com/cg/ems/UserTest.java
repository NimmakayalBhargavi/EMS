package com.cg.ems;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.ems.dto.UserDto;
import com.cg.ems.exception.UserException;
import com.cg.ems.repository.ILoginRepository;
import com.cg.ems.service.ILoginServiceImpl;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class UserTest {
	@Mock
	ILoginRepository loginrepositoryMock;
	@InjectMocks
	ILoginServiceImpl loginServiceMock;
	UserDto u1,u2;
	@BeforeAll
	static void setUpBeforeClass()throws Exception{
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception{
	}
	@BeforeEach
	void setUp() throws Exception{
		u1=new UserDto(101,"12@3","emp",1);
		u2=new UserDto(102,"ab1","student",0);
	}
		@AfterEach
		void tearDown() throws Exception{	
		}
		@Test
		public void validateUserTest()throws UserException {
			when(loginrepositoryMock.equals(u1));
	
			assertEquals(u1, loginServiceMock.validateUser(u1));
		}
		
	

}
