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
    
    private static final Logger logger = Logger.getLogger(Main.class);

    public void tampil(String par){
        if(logger.isDebugEnabled()){
            logger.debug("Ini adalah message : "+par);
        }
        
        if (logger.isInfoEnabled()) {
            logger.info("ini adalah message : "+par);
        }
        
        logger.warn("Ini adalah info message : "+par);
        logger.error("Ini adalah info message : "+par);
        logger.fatal("Ini adalah info message : "+par);
    }
    
    public static void main(String[] args) {
        
        BasicConfigurator.configure();
        
        Main mn = new Main();
        mn.tampil("Contoh Log4J");
      
    }
}
