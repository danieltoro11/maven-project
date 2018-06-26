package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *@param some name of the person 
  *@return greeting string
   */

  //TODO: Add javadoc comment
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
