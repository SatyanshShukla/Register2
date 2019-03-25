package com.cognizant.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.cognizant.model.User;
import com.cognizant.Service.UserService;
import com.cognizant.Service.UserServiceImpl;
@Controller
public class RegistrationController {
  @Autowired
  public UserService userService;
/* @RequestMapping(value = "register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("register");
    mav.addObject("user", new User());
    return mav;
  }
  */
  @RequestMapping("/Register")  
  public ModelAndView showform(){  
       
      return new ModelAndView("Register"); 
  }
  
  
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,@ModelAttribute("user") User user) 
  {
	  ModelAndView mv=new ModelAndView();
  if(userService.register(user)==1)
  mv.setViewName("RegSuccesfull");
  else
	  mv.setViewName("Home");
return mv;
  //return new ModelAndView("welcome", "firstname", user.getFirstname());
  }
}

