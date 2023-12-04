package com.example;


public class Greeter { 

  
  public Greeter() {
  /* commentaire : fonction de bienvenu */ 
  }
  /**
  * @param someone name of person
  * @return greeting string
  **/
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
