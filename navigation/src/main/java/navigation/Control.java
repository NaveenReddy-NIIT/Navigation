package navigation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Control {
	
@RequestMapping(value="/Login")
public String loginPage(Model M)
{
	M.addAttribute("name", "NaveenKumar");
	return "Login";
}
}