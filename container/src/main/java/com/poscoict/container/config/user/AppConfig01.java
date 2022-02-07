package com.poscoict.container.config.user;

import org.springframework.context.annotation.Bean;

import com.poscoict.container.user.User;

public class AppConfig01 {

	@Bean
	public User user() {
		return new User("지믕"); // 값 명시 안 해주면 default 값인 김지은이 출력된다.
	}
}
