package com.wolken.wolkenapp;

import org.apache.log4j.Logger;

//import org.apache.log4j.ConsoleAppender;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;


/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
   Logger logger= Logger.getLogger(App.class);
  
   logger.debug("ddddddddddddddddddddddddddddddd");
   logger.fatal("ffffffffffffffffffffffffffffffffff");
   logger.trace("ttttttttttttttttttttttttttttt");
   test(); 
    }
    static void test() {
    	Logger logger= Logger.getLogger(App.class);
    	   logger.info("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    	   logger.warn("wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww");
    	   logger.error("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
    	   }
}
