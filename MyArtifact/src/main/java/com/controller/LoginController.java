package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;
import com.service.UserService;

@Controller
@RequestMapping("/test")
/*@ResponseBody */ 
public class LoginController {
	 @Autowired  
	 private UserService userService; //���ڽӿڵ�,�ýӿڽ���
	   
	   @RequestMapping("/login.action") //url  
	   public String dologin(User user, Model model){  
	       if(userService.doUserLogin(user)){ 
	    	   System.out.println(user);	    	   
	           model.addAttribute("successMsg", "��½�ɹ���");//���ص�ҳ�����д��Ĳ���  
	           model.addAttribute("name", user.getUsername());  
	           return "/success";//���ص�ҳ��  
	       }else{  
	           model.addAttribute("failMsg", "�û������ڻ��������");  
	           return "/fail";  
	       }     
	   }  
	   
	   

}
