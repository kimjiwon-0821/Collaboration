package com.mhj.s2.Notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mhj.s2.util.PagerK;

@Repository
public class NoticeDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.mhj.s2.Notice.NoticeDAO.";
	
	public List<NoticeDTO> getNoticeList(PagerK pagerK) throws Exception{
		return sqlSession.selectList(NAMESPACE+"getNoticeList",pagerK);
	}

}
