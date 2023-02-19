package com.mhj.s2.Notice;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.mhj.s2.util.PagerK;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {
	@Autowired
	private NoticeService noticeService;

	//list
	@RequestMapping(value="list", method=RequestMethod.GET)
	public ModelAndView getNoticeList(PagerK pagerK) throws Exception{
		ModelAndView mv = new ModelAndView();
		List<NoticeDTO> ar = noticeService.getNoticeList(pagerK);
		
		mv.setViewName("notice/list");
		mv.addObject("list", ar);
		mv.addObject("pagerK",pagerK);
		return mv;
	}
	
	//detail
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public ModelAndView getNoticeDetail(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		mv.setViewName("notice/detail");
		mv.addObject("dto", noticeDTO);
		return mv;
	}
	
	//add form 이동
	@RequestMapping(value="add", method = RequestMethod.GET)
	public ModelAndView setNoticeAdd() throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("notice/add");
		return mv;
		//list.jsp로 돌아가는 메서드
	}
	
	//add DB insert
	   @RequestMapping(value = "add", method = RequestMethod.POST)
	   public ModelAndView setNoticeAdd(NoticeDTO noticeDTO, MultipartFile multipartFile, HttpSession Session) throws Exception {
	      ModelAndView modelAndView = new ModelAndView();
	      System.out.println("Name : " + multipartFile.getName());
	      System.out.println("Original File Name : " + multipartFile.getOriginalFilename());
	      System.out.println("Size : " + multipartFile.getSize());
	      System.out.println(Session.getServletContext());
	      int result = noticeService.setNoticeAdd(noticeDTO, multipartFile);
	      modelAndView.setViewName("redirect:./list");
	      return modelAndView;
	   }
	
	//delete
	@RequestMapping(value="delete", method = RequestMethod.GET)
	public ModelAndView setNoticeDelete(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = noticeService.setNoticeDelete(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	
	//update form 이동
	@RequestMapping(value="update", method = RequestMethod.GET )
	public ModelAndView setNoticeUpdate(NoticeDTO noticeDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		noticeDTO = noticeService.getNoticeDetail(noticeDTO);
		mv.addObject("dto",noticeDTO);
		mv.setViewName("notice/update");
		return mv;
	}
	
	//update DB 
	@RequestMapping(value="update", method = RequestMethod.POST)
	public ModelAndView setNoticeUpdate(NoticeDTO noticeDTO, ModelAndView mv) throws Exception{
		int result = noticeService.setNoticeUpdate(noticeDTO);
		mv.setViewName("redirect:./list");
		return mv;
	}
	

}
