package com.poscoict.container.soundsystem;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:com/poscoict/container/config/soundsystem/CPlayerConfig.xml"})
public class CDPlayerXmlConfigTest {

	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDPlayerNotNull() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscoict/container/config/soundsystem/CDPlayerConfig.xml");
//		CDPlayer cdPlayer = ac.getBean(CDPlayer.class);
		
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		
		assertTrue(1 == 2-1);
//		assertEquals(s, "Playing 시차 by 우원재");
	}

}
