package com.poscoict.container.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poscoict.container.config.videosystem.DvdPlayerConfig;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {DvdPlayerConfig.class})
public class DvdPlayerJavaConfigTest {

	@Autowired
	private DigitalVideoDisc dvd;
	
	@Autowired
	private DVDPlayer dvdPlayer;
	
	@Test
	public void testDVDNotNull() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}
	
}
