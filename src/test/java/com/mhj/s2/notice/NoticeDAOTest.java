package com.mhj.s2.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mhj.s2.MyTestCase;
import com.mhj.s2.util.PagerK;

public class NoticeDAOTest extends MyTestCase{

	@Autowired
	private NoticeDAO noticeDAO;
//	
//	@Test
//	public void getNoticeListTest(PagerK pagerK) throws Exception {
//		 List<NoticeDTO> ar = noticeDAO.getNoticeList(pagerK);
//		 //단정문 
//		 assertNotEquals(0, ar.size());
//	}
//	
//	@Test
//	public void getNoticeDetailTest()throws Exception{
//		NoticeDTO noticeDTO = new NoticeDTO();
//		noticeDTO.setNoNum(11L);
//		noticeDTO = noticeDAO.getNoticeDetail(noticeDTO);
//		assertNotNull(noticeDTO);
//	}
	
	//insert
	@Test
	public void setNoticeAddTest()throws Exception{
		
		for(int i=0;i<20;i++) {
			
			NoticeDTO noticeDTO= new NoticeDTO();
			noticeDTO.setNoHead("kong적금 공지드립니다"+i);
			noticeDTO.setNoBody("콩이의 귀여움을 확인하고자 한다면 "+i);
			noticeDTO.setNoBody("testBody"+i);
		}
		System.out.println("Finish");
		
	}

}
