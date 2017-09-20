package kr.ac.dit.persistence;
import kr.ac.dit.domain.studentVO;
import java.util.*;
public interface studentDAO {
	public void insertStudent(studentVO item) throws Exception;
	public List<studentVO> selectStudent() throws Exception;
}