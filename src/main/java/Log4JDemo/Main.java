/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log4JDemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author SB604-19
 */
public class Main {
    
    private static final Logger logger = Logger.getLogger(mainDao.class);
    
    public static void main(String[] args) {
        
        BasicConfigurator.configure();
        
        logger.debug("Ini adalah debug message : Contoh log4j");        
        logger.info("Ini adalah info message : Contoh log4j");
        logger.warn("Ini adalah info message : Contoh log4j");
        logger.error("Ini adalah info message : Contoh log4j");
        logger.fatal("Ini adalah info message : Contoh log4j");
        
      
    }
}
