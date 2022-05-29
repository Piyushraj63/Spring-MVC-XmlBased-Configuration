package get.tom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import get.tom.Services.AddServices;

@Controller
public class AddController {
    
	@RequestMapping("/add")
	public ModelAndView getAdd(@RequestParam("n1")int j,@RequestParam("n2")int k) {
		
		AddServices ad=new AddServices();
		
		int l=ad.addition(j, k);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addanswer.jsp");
		mv.addObject("result",l);
		return mv;
	}
}
