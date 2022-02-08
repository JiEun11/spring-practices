package com.poscoict.container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/*
 *   <---------- JavaConfig1(DVDConfig) + JavaConfig2(DVDPlayerConfig)
 * 								Import
 * 
 *  JavaConfig2 + JavaConfig1
 */

@Configuration
@Import({DVDConfig.class, DVDPlayerConfig.class})
public class VideoSystemConfig {

}
