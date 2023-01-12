package project.thymleeafbasic.basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/basic")
public class BasicController {

	@GetMapping("text-basic")
	public String textBasic(Model model){
		model.addAttribute("data", "hello <b>spring</b>");
		return "basic/text-basic";
	}

	@GetMapping("text-unescape")
	public String textUnEscape(Model model){
		model.addAttribute("data", "hello <b>spring</b>");
		return "basic/text-unescape";
	}
}
