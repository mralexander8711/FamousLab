package co.grandcircus.famouslab;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.famouslab.model.Complete;

@Controller
public class famousController {
	
	
	@RequestMapping("/")
	public ModelAndView showPerson() {
		ModelAndView mav =new ModelAndView("index");
		return mav;
		
		
	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<Complete> complete = ApiService.findAll();
		return new ModelAndView("complete","comlete",complete);
	}
		
	}
}
