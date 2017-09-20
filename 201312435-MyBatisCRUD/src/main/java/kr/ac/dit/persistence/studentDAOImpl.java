package kr.ac.dit.persistence;
import javax.inject.Inject;
import java.util.*;
import javax.inject.*;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.studentVO;
@Repository
public class studentDAOImpl implements studentDAO {
	//bean root에서 땡겨옴
	//inject 객체를 스프링 에서 뉴 한다음에 가져옴
	//vo에서 값을 가져와서 item에다가 넣음
	 @Inject SqlSession sqlSession; // ==new root-context 에 들어있음
	 @Override
	 public void insertStudent(studentVO item) throws Exception {
		 sqlSession.insert("StudentMapper.insertStudent",item);
	 }
	 public List<studentVO> selectStudent() throws Exception {
		 return sqlSession.selectList("StudentMapper.selectStudent");
	 }
}