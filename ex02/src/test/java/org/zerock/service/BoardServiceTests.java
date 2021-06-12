package org.zerock.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {

	@Setter(onMethod_ = {@Autowired} )
	private BoardService service;
	
	
//	@Test
//	public void testExists() {
//		log.info("testService!!!!!!");
//		
//		
//		log.info(service);
//		assertNotNull(service);
//	}
//	
//	@Test
//	public void testRegister() {
//		log.info("testRegister!!!!!!");
//		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("새로등록하는 글");
//		vo.setContent("등록하는 내용");
//		vo.setWriter("hongminkim");
//		
//		service.register(vo);
//		
//		log.info("등록한 키 값은 : "+ vo.getBno());
//			
//	}
	
	
//	@Test
//	public void testGetList() {
//		log.info("------------testGetList------------");
//		
//		service.getList().forEach(board-> log.info(board));
//	}
	
	
//	@Test
//	public void testRead() {
//		log.info("------------testRead------------");
//		
//		log.info(service.get(23L));
//	}
	
	@Test
	public void testUpdateAndDelete() {
		log.info("------------testUpdateAndDelete------------");
		
		BoardVO vo = new BoardVO();
		vo.setBno(23L);
		vo.setTitle("제목 수정 테스트중입니다");
		vo.setContent("내용 수정중입니다!");
		vo.setWriter("hongma");
		
		service.modify(vo);
		
		
		log.info(service.get(23L));
		
		
		service.remove(23L);
		
		
	}
	
	
}
