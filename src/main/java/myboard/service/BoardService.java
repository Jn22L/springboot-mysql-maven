package myboard.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myboard.model.BoardVO;
import myboard.mapper.BoardMapper;
 
@Service
public class BoardService {
 
	@Autowired
    private BoardMapper boardMapper;
	    
    public List<BoardVO> selectAll() throws Exception{
        return boardMapper.selectAll();
    }
      

}