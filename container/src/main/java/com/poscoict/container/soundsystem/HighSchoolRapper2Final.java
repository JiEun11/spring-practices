package com.poscoict.container.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class HighSchoolRapper2Final implements CompactDisc {

	private String artist = "우원재";
	private String title = "시차";
	
	
	@Override
	public void play() {
		System.out.println("Playing " + title +" by " + artist);

	}

}
