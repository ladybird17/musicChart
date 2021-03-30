package com.bitc.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.xml.dto.ChartDto;
import com.bitc.xml.service.ChartService;

//0329 XML파일을 parsing하기 문제1번
@Controller
public class ChartController {
	@Autowired
	private ChartService chartService;
	
	@RequestMapping(value="/chart/topten1", method=RequestMethod.GET)
	public ModelAndView topten1() throws Exception{
		ModelAndView mv = new ModelAndView("/chart/topten1");
		
		List<ChartDto> list = chartService.getChartList();
		mv.addObject("xmlDatas", list);
		
		//데이터확인용
		for(ChartDto member : list) {
			System.out.println("ID : "+member.getId());
			System.out.println("Title : "+member.getTitle());
			System.out.println("Album : "+member.getAlbum());
			System.out.println("Musician : "+member.getMusician());
			System.out.println("Release : "+member.getRelease());
			System.out.println("Genre : "+member.getGenre());
			System.out.println("---------------------------------");
		}
		
		return mv;
		
	}
	
	@ResponseBody
	@RequestMapping(value="/chart/topten2", method=RequestMethod.POST)
	public Object topten2() throws Exception{
		List<ChartDto> list = chartService.getChartList();
		return list;
	}
}
