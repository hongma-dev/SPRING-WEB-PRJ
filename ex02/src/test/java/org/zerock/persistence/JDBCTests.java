package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			log.error(e.getMessage());
		}
	}
	
	
	@Test
	public void testConnection() {
		
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@devplace.co.kr:1521:redsoft",
					"REDTEST",
					"REDTEST123"
			);
				
			log.info("testConnection Suc!!");
		}catch(Exception e) {
			fail(e.getMessage());
		}
		
	}
}
