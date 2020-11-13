package myboard.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import myboard.model.BoardVO;
import myboard.service.BoardService;
 
@RestController
public class BoardController {
 
	@Autowired
    private BoardService boardService;
	    
    @RequestMapping("/selectAll")
    public List<BoardVO> selectAll() throws Exception{
        List<BoardVO> board = boardService.selectAll();
        return board;
    }
      

}