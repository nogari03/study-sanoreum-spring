package project.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import project.user.dto.LoginDTO;
import project.user.vo.UserVO;

public interface MypageController {
	
	public ModelAndView mypageHomeView (HttpSession httpSession) throws Exception;

	public ModelAndView updateUserView(HttpSession httpSession) throws Exception;
	
	public String updateUser(HttpSession httpsession, UserVO userVO) throws Exception;
	
	public String updateUserInfo(@RequestParam String profile, @RequestParam(value="file", required=false) MultipartFile file, HttpServletRequest request,
			HttpSession httpSession) throws Exception;
	
	public String pwdCheck(@RequestParam("pwd") String pwd, HttpSession httpSession) throws Exception;
	}
	
