package com.mhj.s2.notice;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.mhj.s2.util.FileManagerK;
import com.mhj.s2.util.PagerK;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private FileManagerK fileManagerK;
	public List<NoticeDTO> getNoticeList(PagerK pagerK) throws Exception {
		pagerK.makeRow();
		Long totalCount = noticeDAO.getNoticeCount(pagerK);
		pagerK.makeNum(totalCount);
	    return noticeDAO.getNoticeList(pagerK);
	}
	
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.getNoticeDetail(noticeDTO);
	}
	
	 public int setNoticeAdd(NoticeDTO noticeDTO, MultipartFile multipartFile) throws Exception {
	      int result = noticeDAO.setNoticeAdd(noticeDTO);
	      
	      if(!multipartFile.isEmpty()) {
	      String path = servletContext.getRealPath("resources/upload/notice");
	      System.out.println(path);
	      String fileName = fileManagerK.fileSave(multipartFile,path);
	     
	      NoticeImgDTO noticeImgDTO = new NoticeImgDTO();
	      noticeImgDTO.setFileName(fileName);
	      noticeImgDTO.setOriName(multipartFile.getOriginalFilename());
	      noticeImgDTO.setNoNum(noticeDTO.getNoNum());
	      
	      result = noticeDAO.setNoticeImgAdd(noticeImgDTO);
	      }
	      return result;
	 }
	 
	public int setNoticeDelete(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.setNoticeDelete(noticeDTO);
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.setNoticeUpdate(noticeDTO);
	}

}