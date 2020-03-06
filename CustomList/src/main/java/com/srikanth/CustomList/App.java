package com.srikanth.CustomList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) throws Exception
    {
        MyList arr = new MyList();
        logger.info("Initial size: "+arr.size());
        arr.add(9);
        arr.add(1);
        arr.add(4);
        arr.add(2);
        logger.info("After insertion: "+arr.size());
        logger.info(arr);
        arr.removeByIndex(1);
        logger.info(arr);
        for(int i=0;i<10;i++) {
        	arr.add(i*10);
        }
        arr.removeByValue(20);
        logger.info(arr);
        MyList arr1 = new MyList();
        arr1.add(12);
        logger.info(arr1);
        arr1.removeByValue(12);
        arr1.add(13);
        arr1.removeByValue(1);
 
    }
}
