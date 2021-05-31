package org.zerock.mapper;

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
public class BoardMapoperTests {

	@Setter(onMethod_=@Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public  void testGetList() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
	
//	@Test
//	public  void testInsert() {
//		BoardVO vo = new BoardVO();
//		vo.setTitle("insert Test");
//		vo.setContent("content insert test");
//		vo.setWriter("hongma");
//		
//		mapper.insert(vo);
//		
//		log.info("insert vo : "+vo);
//	}
	
//	@Test
//	public  void testRead() {
//		log.info("BoardVO !!!!!!!!!!!!!!!!!!!! : "+ mapper.read(2L));
//	}
	
	
//	@Test
//	public  void deleteTest() {
//		log.info("DEL CNT !!!!!!!! : "+ mapper.delete(2L));
//	}
	
	
	@Test
	public  void updateTest() {
		BoardVO vo = new BoardVO();
		vo.setBno(3L);
		vo.setTitle("update Test !!");
		vo.setContent("content update test!!");
		vo.setWriter("hongma");
		
		int updateCnt = mapper.update(vo);
		
		log.info("update cnt !!!!!!!!!! : "+updateCnt);
	}
}
