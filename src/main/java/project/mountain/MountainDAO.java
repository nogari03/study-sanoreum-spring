package project.mountain;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("mountainDAO")
public class MountainDAO {

    @Autowired
    private SqlSession sqlSession;

    public List selectMountainByRank(){
        return sqlSession.selectList("mountain.selectMountainByRank");
    }
    public List selectTrailByRank(){
        return sqlSession.selectList("mountain.selectTrailByRank");
    }

    public int followMountainFunction(Map map){
        return sqlSession.insert("mountain.followMountainFunction",map);
    }

    public String checkMtLike(Map map){
        return sqlSession.selectOne("mountain.checkMtLike",map);
    }
    public int followMountainCount(String mntilistno){
        return sqlSession.selectOne("mountain.followMountainCount",mntilistno);
    }
    public void insertTrailInfo(Map map){
        sqlSession.insert("mountain.insertTrailInfo",map);
    }
    public void insertTrailLocation(Map map){
        sqlSession.insert("mountain.insertTrailLocation",map);
    }
    public void insertTrailSpot(Map map){
        sqlSession.insert("mountain.insertTrailSpot",map);
    }

    public List selectTrailLocation(Map map){
        return sqlSession.selectList("mountain.selectTrailLocation",map);
    }
    public List selectTrailInfo(Map map){
        return sqlSession.selectList("mountain.selectTrailInfo",map);
    }
}