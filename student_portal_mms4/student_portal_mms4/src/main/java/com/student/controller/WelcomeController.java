 package com.student.controller;

 import com.student.service.WelcomeService;
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RestController;

  @RestController
  public class WelcomeController{

    private final WelcomeService wService;
  
    public WelcomeController(WelcomeService wService){
    this.wService = wService;
   }

   @GetMapping("/")
   public String printWelcome(){
   return wService.getHeader();
  }

  @GetMapping("api/hello")
  public HelloResponse apiHello(){
    return new HelloResponse(
       wService.getHeader()
    );
  }
}