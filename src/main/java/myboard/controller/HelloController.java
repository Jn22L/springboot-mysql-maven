package myboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import myboard.model.BoardVO;
import myboard.service.BoardService;
 
@Controller 
public class HelloController {
     
	@Autowired
    private BoardService boardService;
	
	@GetMapping
	@RequestMapping("/hello")
    public ModelAndView hello() throws Exception{
		
   	    List<BoardVO> board = boardService.selectAll();
        ModelAndView mav = new ModelAndView("hello");
        mav.addObject("list", board); 
        return mav;       
    }
 
}