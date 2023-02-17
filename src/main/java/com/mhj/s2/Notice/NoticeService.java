package com.mhj.s2.Notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhj.s2.util.PagerK;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO noticeDAO;
	
	public List<NoticeDTO> getNoticeList(PagerK pagerK) throws Exception{
		pagerK.makeRow();
		Long totalCount = noticeDAO.getNoticeList(pagerK);
		pagerK.makeNum(totalCount);
		return noticeDAO.getNoticeList(pagerK);
	}

}
