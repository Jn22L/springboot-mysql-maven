package myboard.mapper;
 
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import myboard.model.BoardVO;

@Mapper 
public interface BoardMapper {
    public List<BoardVO> selectAll()throws Exception;
}