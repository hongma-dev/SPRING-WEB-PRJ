package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		log.info("list method @@@@@@@@@@@@@@@@@@@@");
		
		
		model.addAttribute("list",service.getList());
	}
	
	
	@PostMapping("register")
	public String register(BoardVO vo, RedirectAttributes rttr) {
		log.info("register method @@@@@@@@@@@@@@@@@@@@");
		
		service.register(vo);
		
		rttr.addFlashAttribute("result", vo.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/get")
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("get method @@@@@@@@@@@@@@@@@@@@");
		
		
		model.addAttribute("board",service.get(bno));
	}
	
	@PostMapping("modify")
	public String modify(BoardVO vo, RedirectAttributes rttr) {
		log.info("modify method @@@@@@@@@@@@@@@@@@@@");
		
		if(service.modify(vo)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("remove")
	public String removeremove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("remove method @@@@@@@@@@@@@@@@@@@@");
		
		if(service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
}
