package com.ascorp.deadlock;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Zoo
{
	public static void main(String[] args) {
	    Map<Integer, String> cMap = new ConcurrentHashMap<>();
	    cMap.put(1, "value1");
	    cMap.put(2, "value2");
	    cMap.put(3, "value3");
	    cMap.put(4, "value4");

	    try {
	       for (Map.Entry<Integer, String> output1 : cMap.entrySet()) {
	            cMap.remove(2);
	            System.exit(0);
	       }
	    }

	    finally{
	        System.out.println("Infinally");
	    }
	  }
}