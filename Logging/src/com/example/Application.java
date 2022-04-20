package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Logger log=Logger.getLogger("com.example.Application");
		
		log.info("Info Message");
		
		//for a difference between log.ingo() and syso
		//but in real time use log.info() in logging
		
		//System.out.println("Info Message");
		log.setLevel(Level.SEVERE);
		
		
		log.warning("--------Warning Message-------");
		
		 log.severe("***********SEVERE MESSAGE**********");
		 
		log.fine("#####FINE########"); 
	}

}
