package springsearchexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeControler {

	@RequestMapping("/home")
	
	public String home() {
		
		System.out.println("home page");
		
		return "home";
	}
	@RequestMapping(value="/userform",method = RequestMethod.GET)
	
	public String userform(@RequestParam("name")String username,Model model) {
		System.out.println("welcome page");
		System.out.println(username);
		model.addAttribute("msg",username);
		return "view";
	}
	
}
