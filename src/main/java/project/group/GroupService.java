package project.group;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface GroupService {

    void insertGroup(Map map) throws Exception;
    List<Map> selectMainGroupList();
    List<Map> selectAllGroupList();
    Map selectGroupDetail(int groupNum);
    List<Map> selectGroupDetailImage(int groupNum);
    List<Map> selectGroupsByKeyword(String keyword);

    //
    int joinGroup(Map map);

    int withdrawGroup(Map map);
    List selectWaitingList(Map map);
    Map selectWaiting(Map map);
    int userAllowed(Map map);
    int userDisallowed(Map map);

    int checkGroupExpired(int groupNum);
    int expiredGroup(int groupNum);

    List<Integer> listApplied(int groupNum);

    int insertFavoriteGroup(Map map);
    int checkFavoriteGroup(Map map);
    int deleteFavoriteGroup(Map map);

    int insertCommentGroup(Map map);
    int updateSubCommentCount(int parentNum);
    GroupCommentVO selectCommentOne(int commentNum);
    List selectCommentByGroupNum(int groupNum);
    List selectCommentByPostNum(int postNum);

    String selectSessionIdImage(String userId);
    List sortGroupByKeyword(Map map);
    List recommendGroup(Map map);
	int countSubComment(Map map);

    int updateGroupInfo(Map map);
    void deleteGroup(Map map);

    void deleteComment(Map map);

    List selectGroupLikeById(String userId);
    String selectGroupLeader(int groupNum);
    void insertAlarm(Map map);
}
