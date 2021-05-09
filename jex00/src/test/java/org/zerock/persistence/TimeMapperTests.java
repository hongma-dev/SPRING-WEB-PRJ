package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class TimeMapperTests {
	
	@Setter(onMethod_ = {@Autowired})
	private TimeMapper timeMapper;
	
	
	@Test
	public void testMapper() {
		log.info(timeMapper.getClass().getName());
		log.info("testMapper: " +timeMapper.getTime());
	}
	
	
	
	@Test
	public void testMapper2() {
		log.info(timeMapper.getClass().getName());
		log.info("testMapper2: " +timeMapper.getTime());
	}
	
	
}
