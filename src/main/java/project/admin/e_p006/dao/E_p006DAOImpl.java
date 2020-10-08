package project.admin.e_p006.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.admin.e_p006.vo.E_p006VO;

@Repository
public class E_p006DAOImpl implements E_p006DAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	
	// cs게시글 통계
	@Override
	public List<E_p006VO> searchDatePieChart(Map<String, String> search_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.searchDatePieChart",search_keyword);
	}
	// 매출 통계
	@Override
	public List<E_p006VO> searchDateColumnChart(Map<String, String> search_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.searchDateColumnChart",search_keyword);
	}
	// 가입자 통계 라인차트
	@Override
	public List<E_p006VO> serchUserLineChart(Map<String, String> search_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.serchUserLineChart",search_keyword);
	}
	// 가입자 통계 바 차트
	@Override
	public List<E_p006VO> serchUserBarChart(Map<String, String> search_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.serchUserBarChart",search_keyword);
	}

	
//  --------------------------------------------------------------------------------------------------------           

	// cs게시글 통계
	@Override
	public List<E_p006VO> selectPieChart(Map<String, String> select_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.selectPieChart",select_keyword);
	}
	// 매출통계
	@Override
	public List<E_p006VO> selectColumnChart(Map<String, String> select_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.selectColumnChart",select_keyword);
	}

	// 가입자 통계
	@Override
	public List<E_p006VO> selectUserLineChart(Map<String, String> select_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.selectUserLineChart",select_keyword);
	}

	// 가입자 통계 바 차트
	@Override
	public List<E_p006VO> selectUserBarChart(Map<String, String> select_keyword) throws Exception {
		return sqlSession.selectList("admin.mapper.e_p006.selectUserBarChart",select_keyword);
	}
	
}
