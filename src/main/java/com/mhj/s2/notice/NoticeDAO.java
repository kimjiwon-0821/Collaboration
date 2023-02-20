package com.mhj.s2.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mhj.s2.util.PagerK;

@Repository
public class NoticeDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.mhj.s2.notice.NoticeDAO.";
	public Long getNoticeCount(PagerK pagerK) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getNoticeCount",pagerK);
	}
	public List<NoticeDTO> getNoticeList(PagerK pagerK) throws Exception {
	      return sqlSession.selectList(NAMESPACE+"getNoticeList", pagerK);
	   }
	public NoticeDTO getNoticeDetail(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"getNoticeDetail", noticeDTO);
	}
	public int setNoticeAdd(NoticeDTO noticeDTO) throws Exception{
			return sqlSession.insert(NAMESPACE+"setNoticeAdd", noticeDTO);
		}
	public int setNoticeDelete(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"setNoticeDelete",noticeDTO);
	}
	public int setNoticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"setNoticeUpdate", noticeDTO);
	}
	public int setNoticeImgAdd(NoticeImgDTO noticeImgDTO) throws Exception {
		   return sqlSession.insert(NAMESPACE+"setNoticeImgAdd", noticeImgDTO);
	}
	
}
