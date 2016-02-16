package com.mureka.musicaltube.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

	private static final Logger logger = LoggerFactory.getLogger(ListController.class);
	
	
	@RequestMapping("/detail")
	public String detail() {
		return "detail";
	}
	
	@RequestMapping("/detail2")
	public String detail2() {
		return "detail2";
	}
	
	@RequestMapping("/song_t")
	public String song_t() {
		return "song_t";
	}
	
	@RequestMapping("/song_k")
	public String song_k() {
		return "song_k";
	}
	
}
