package com.poscoict.container.config.videosystem.mixing;

import org.springframework.context.annotation.Bean;

import com.poscoict.container.videosystem.Avengers;
import com.poscoict.container.videosystem.BlankDisc;
import com.poscoict.container.videosystem.DigitalVideoDisc;

public class DVDConfig {

	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}

	@Bean(name="avengersInfinityWar")
	public DigitalVideoDisc blankDisc() {
		BlankDisc dvd = new BlankDisc();
		dvd.setTitle("Avengers Infinity War");
		dvd.setStudio("MARVEL");
		
		return dvd;
	}


}
