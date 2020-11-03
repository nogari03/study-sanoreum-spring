package project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import project.after.AfterService;
import project.commu.CommuService;
import project.group.GroupService;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import java.util.List;

@Controller
@EnableSwagger2
public class HomeController {

	@Resource(name = "groupService")
	private GroupService groupService;

	@Resource(name = "afterService")
	private AfterService afterService;

	@Resource(name = "commuService")
	private CommuService commuService;
	
	@GetMapping("/main.do")
	public String home(ModelAndView mav) {
		return "home";
	}

	@GetMapping("/main/groupList.do")
	@ResponseBody
	public List mainGroupList(){
		return groupService.selectMainGroupList();
	}

	@GetMapping("/main/afterList.do")
	@ResponseBody
	public List mainAfterList(){
		return afterService.selectMainAfterList();
	}

//	@GetMapping("/main/commuList.do")
//	@ResponseBody
//	public List mainCommuList() {
//		return commuService.selectAllCommuList();
//	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminHome() {
		return "admin_home";
	}
}
