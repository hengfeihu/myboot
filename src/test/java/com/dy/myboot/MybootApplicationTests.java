package com.dy.myboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybootApplicationTests {

	@Test
	public void contextLoads() {
		String pass = "111";
		BCryptPasswordEncoder encode = new BCryptPasswordEncoder();
		String hashPass = encode.encode(pass);
		System.out.println(hashPass);
	}

}
