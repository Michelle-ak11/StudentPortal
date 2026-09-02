package com.student.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService{

  public String getHeader(){
   return """
     <html>
     <head>
     <title>MMS4</title>
     </head>
     <body background-color="orange">
     <h1>Welcome to MMS4</h1>
     </body>
     </html>
    """;  
  }
}