package com.poscoict.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscoict.container.videosystem.Avengers;
import com.poscoict.container.videosystem.DVDPlayer;
import com.poscoict.container.videosystem.DigitalVideoDisc;

@Configuration
public class DvdPlayerConfig {

	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}

	/* 주입이 안 된채로 리턴한 코드...삭제하기 */
//	@Bean
//	public DVDPlayer dvdPlayer() {
//		return new DVDPlayer();
//	}

	// 주입(Injection) 하기 1
	// Bean 생성 메소드를 직접 호출하는 방법
	// 생성자 주입 , DVDPlayer를 만드는 dvd 생성자
	// @Bean
	public DVDPlayer dvdPlayer01() {
		return new DVDPlayer(avengers());
	}

	// 주입(Injection) 하기 2
	// Parameter로 bean 전달하기
	// 생성자 주입
	// @Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

	// 주입(Injection) 하기 3
	// Parameter로 bean 전달하기
	// setter 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		
		return dvdPlayer;
	}
	
	// 같은 타입의 bean을 생성할 경우 
	@Bean(name="dvdPlayer04")
	public DVDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

}
