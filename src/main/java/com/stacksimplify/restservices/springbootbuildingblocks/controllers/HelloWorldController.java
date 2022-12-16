package com.stacksimplify.restservices.springbootbuildingblocks.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservices.springbootbuildingblocks.domains.UserDetails;

@RestController
public class HelloWorldController {
  
  @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
  //@GetMapping("helloworld")
  public String helloWorld(){
    return "Hello World";
  }

  @GetMapping("helloworld-bean")
  public UserDetails helloWorldBean(){
    return new UserDetails("Pepe", "Perez", "Jujuy");
  }
}
