//package com.qa.playlist.rest;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.jdbc.Sql;
//import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.qa.playlist.domain.Playlist;
//
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//@ActiveProfiles("test")
//@Sql(scripts = {"classpath:account-schema.sql", "classpath:playlist-data.sql"}, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
//public class PlaylistControllerIntegrationTesting {
//	
//	@Autowired
//	private MockMvc Mvc;
//	
//	@Autowired
//	private ObjectMapper mapper;
//	
//	@Test
//	void testCreate() throws Exception {
//		Playlist test = new Playlist("testPlaylist", null);
//	}
//	
//	
//
//}
